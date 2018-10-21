/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective.register;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sit.freeelective.FreeElective.student.Student;
import com.sit.freeelective.FreeElective.student.StudentRepository;
import com.sit.freeelective.FreeElective.subject.Subject;
import com.sit.freeelective.FreeElective.subject.SubjectService;
import com.zaxxer.hikari.HikariDataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.activation.DataSource;
import javax.persistence.Query;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author wdrdr
 */
@Service
public class RegisterService {

    @Autowired
    HikariDataSource dataSource;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectService subjectService;

    public Map<String, Object> registerSubjectForStudent(Map<String, Object> request) {
        Map<String, Object> response = new HashMap<>();
        ArrayList<Integer> selectedSubjectId = (ArrayList<Integer>) (request.get("id"));
        Student student = this.parseStudent(request);
        System.out.println("Refactor work : " + student);
        if (this.isStudentYearMeetRequirement(student, selectedSubjectId)) {
            response = this.registerSubjectToStudentIfAvaiable(student, selectedSubjectId);
        }
        return response;
    }

    public Student parseStudent(Map<String, Object> request) {
        Student parsedStudent = new Student();
        Map<String, Object> studentJson = (Map<String, Object>) (request.get("student"));
        parsedStudent.setStudentId((long) (studentJson.get("studentId")));
        parsedStudent.setName(((String) (studentJson.get("name"))));
        parsedStudent.setSurname(((String) (studentJson.get("surname"))));
        parsedStudent.setDepartment(((String) (studentJson.get("department"))));
        parsedStudent.setFaculty(((String) (studentJson.get("faculty"))));
        parsedStudent.setYear((int) (studentJson.get("year")));
        return parsedStudent;
    }

    public boolean isStudentYearMeetRequirement(Student student, ArrayList<Integer> selectedSubjectId) {
        boolean isMeetYearRequirement = false;
        if (student.getYear() == 4) {
            if (selectedSubjectId.size() == 1) {
                isMeetYearRequirement = true;
            }
        } else if (student.getYear() == 3) {
            if (selectedSubjectId.size() <= 2) {
                isMeetYearRequirement = true;
            }
        }
        return isMeetYearRequirement;
    }

    public Map<String, Object> registerSubjectToStudentIfAvaiable(Student student, ArrayList<Integer> selectedSubjectId) {
        Map<String, Object> response = new HashMap<>();
        for (Integer subjectId : selectedSubjectId) {
            Subject subject = subjectService.getSubjectById(subjectId);
            if (subject.getMaxStudentEnrollment() > subject.getCurrentStudentEnrollment()) {
                int beforeUpdateEnrollment = subject.getCurrentStudentEnrollment();
                System.out.println("before : " + beforeUpdateEnrollment);
                ++beforeUpdateEnrollment;
                int afterUpdateEnrollment = beforeUpdateEnrollment;
                System.out.println("after : " + afterUpdateEnrollment);
                subject.setCurrentStudentEnrollment(afterUpdateEnrollment);
                subjectService.save(subject);
                JdbcTemplate jdbc = new JdbcTemplate(dataSource);
                jdbc.update("insert into subject_students values (?, ?)", subjectId, student.getStudentId());
                response.put("Subject " + subjectId, true);
            } else {
                response.put("Subject " + subjectId, false);
            }
        }
        return response;
    }

}
