/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective.subject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wdrdr
 */
@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public Iterable<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
    
    public List<Subject> getAllSubjectsList() {
        Iterator<Subject> studentIterator = subjectRepository.findAll().iterator();
        List<Subject> subjectList = new ArrayList<>();
        while (studentIterator.hasNext()) {
            Subject subject = studentIterator.next();
            subjectList.add(subject);
        }
        return subjectList;
    }

    public Subject getSubjectById(int id) {
       return subjectRepository.getOne(id);
    }
    public Subject save(Subject subject){
        return subjectRepository.save(subject);
    }
    
   
    
    
    
}
