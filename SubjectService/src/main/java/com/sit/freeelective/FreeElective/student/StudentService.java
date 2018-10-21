/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective.student;

import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author wdrdr
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudentById(long studentId) {
        Student student = studentRepository.getOne(studentId);
        System.out.println(student);
        return student;
    }

    public Student login(HashMap<String, Object> loginData) {
        long studentId = (Long) (loginData.get("studentId"));
        String password = (String) loginData.get("password");
        System.out.println(studentId + " | | " + password);
        Student student = studentRepository.findById(studentId).get();
        return student;
    }
    
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    

}
