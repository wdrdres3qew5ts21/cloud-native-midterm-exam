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
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 *
 * @author wdrdr
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SubjectServiceTest {
    @Autowired
    SubjectService subjectService;

    public SubjectServiceTest() {
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
        System.out.println(subjectList.get(0));
        List<Subject> allSubjects = subjectService.getAllSubjects();
        assertEquals(allSubjects.get(0).toString(), subjectList.get(0).toString());
        assertEquals(allSubjects.get(1).toString(), subjectList.get(1).toString());
        assertEquals(allSubjects.get(2).toString(), subjectList.get(2).toString());
        assertEquals(allSubjects.get(3).toString(), subjectList.get(3).toString());
    }

}
