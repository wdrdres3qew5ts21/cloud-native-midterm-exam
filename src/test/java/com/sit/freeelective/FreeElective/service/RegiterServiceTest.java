/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective.service;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 *
 * @author wdrdr
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class RegiterServiceTest {
    @Autowired
    SubjectService subjectService;

    public RegiterServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("!!! Start Testing Register Service !!!");
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

//    @Test
//    public void testSomeMethod() {
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    @Test
    public void showAllFreeElectiveSubject() {
        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(new Subject(1, "INT492", "Big Data Analytic", "Dr.Praisan Padungweang", 30));
        subjectList.add(new Subject(2, "INT491", "Cloud-native application development", "Kittiphan Puapholthep", 30));
        subjectList.add(new Subject(3, "INT491", "Management Information System", "Assoc. Prof. Dr. Nipon Charoenkitkarn", 30));
        subjectList.add(new Subject(4, "INT492", "Data Center System Design", "Pichai Kositpantavong", 30));
        //SubjectService subjectService = new SubjectService();
        System.out.println(subjectService.getAllSubjects());
        //assertEquals(subjectService.getAllSubjects(), subjectList);
        System.out.println("WTF Test");
    }

}
