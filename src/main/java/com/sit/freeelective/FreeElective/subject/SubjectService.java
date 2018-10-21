/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective.service;

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

    public List<Subject> getAllSubjects() {
        Iterator<Subject> studentIterator = subjectRepository.findAll().iterator();
        List<Subject> subjectList = new ArrayList<>();
        while (studentIterator.hasNext()) {
            Subject subject = studentIterator.next();
            subjectList.add(subject);
        }
        return subjectList;
    }
}
