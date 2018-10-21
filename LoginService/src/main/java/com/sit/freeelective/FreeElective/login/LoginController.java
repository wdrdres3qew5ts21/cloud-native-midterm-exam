/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective.login;

import com.sit.freeelective.FreeElective.student.Student;
import com.sit.freeelective.FreeElective.student.StudentService;
import com.sit.freeelective.FreeElective.subject.Subject;
import com.sit.freeelective.FreeElective.subject.SubjectRepository;
import com.sit.freeelective.FreeElective.subject.SubjectService;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author wdrdr
 */
@RestController
public class LoginController {

    @Autowired
    private SubjectService subjectService;

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String helloWorld() {
        long id = 59130500097l;
        return "Hello World Son!!!" + id;
    }

    @PostMapping("/login")
    public ResponseEntity<HashMap> login(@RequestBody HashMap<String, Object> loginData) {
        System.out.println(loginData);
        studentService.login(loginData);
        return new ResponseEntity<HashMap>(loginData, HttpStatus.OK);
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> get() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(59130500097l, "Supakorn", "Trakulmaiphol", "IT", "SIT", 3));
        students.add(new Student(59130500097l, "Supakorn", "Trakulmaiphol", "IT", "SIT", 3));
        students.add(new Student(59130500097l, "Supakorn", "Trakulmaiphol", "IT", "SIT", 3));
        students.add(new Student(59130500097l, "Supakorn", "Trakulmaiphol", "IT", "SIT", 3));
        return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id) {
        Student student = studentService.getStudentById(Long.parseLong(id));
        return student;
    }

    @GetMapping("/subjects")
    public Iterable<Subject> getSubect() {
//        List<Subject> subjectList = new ArrayList<>();
//        subjectList.add(subjectService.save(new Subject(1, "INT492", "Big Data Analytic", "Dr.Praisan Padungweang", 30)));
//        subjectList.add(subjectService.save(new Subject(2, "INT491", "Cloud-native application development", "Kittiphan Puapholthep", 30)));
//        subjectList.add(subjectService.save(new Subject(3, "INT491", "Management Information System", "Assoc. Prof. Dr. Nipon Charoenkitkarn", 30)));
//        subjectList.add(subjectService.save(new Subject(4, "INT492", "Data Center System Design", "Pichai Kositpantavong", 30)));
//        List<Subject> subjectList = subjectService.findAll();
        return subjectService.getAllSubjects();
    }
    
    @PostMapping("/register/subject")
    public ResponseEntity<Map> registerSubject(){
        
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
        return null;
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody Object input) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }

}
