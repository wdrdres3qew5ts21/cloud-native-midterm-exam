/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wdrdr
 */
@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;
    
    public Student getStudentById(long studentId){
        Student student = studentRepository.getOne(studentId);
        System.out.println(student);
        return student;
    }
    
}
