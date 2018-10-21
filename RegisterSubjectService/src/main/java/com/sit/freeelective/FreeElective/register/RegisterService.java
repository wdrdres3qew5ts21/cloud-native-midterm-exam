/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective.register;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sit.freeelective.FreeElective.student.Student;
import com.sit.freeelective.FreeElective.student.StudentRepository;
import java.util.ArrayList;
import java.util.Map;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wdrdr
 */
@Service
public class RegisterService {

    @Autowired
    private StudentRepository studentRepository;
    

    public void registerSubjectForStudent(Map<String, Object> request) {
        ArrayList<Integer> selectedSubjectId = (ArrayList<Integer>) (request.get("id"));
        Student student = this.parseStudent(request);
        System.out.println("Refactor work : " + student);
        this.isStudentYearMeetRequirement(student, selectedSubjectId);
        
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

    public boolean isSubjectAvailable(Student student, boolean isMeetYearRequirement) {
        
        return false;
    }

}
