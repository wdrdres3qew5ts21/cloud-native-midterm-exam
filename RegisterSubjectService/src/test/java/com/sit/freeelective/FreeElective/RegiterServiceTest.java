/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective;

import com.sit.freeelective.FreeElective.register.RegisterService;
import com.sit.freeelective.FreeElective.student.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author wdrdr
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RegiterServiceTest {
    
    @Autowired
    RegisterService registerService;
    
    public RegiterServiceTest() {
    }
    
    @Test
    public void test(){
        
    }
    /**
     * Test of registerSubjectForStudent method, of class RegisterService.
     */
   // @Test
    public void testRegisterSubjectForStudent() {
        System.out.println("registerSubjectForStudent");
        Map<String, Object> request = null;
        RegisterService instance = new RegisterService();
        instance.registerSubjectForStudent(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parseStudent method, of class RegisterService.
     */
    @Test
    public void testParseStudent() {
        System.out.println("parseStudent");
        Map<String, Object> request= new HashMap<>();
        request.put("studentId", new Long(59130500097l));
        request.put("name", "Supakorn");
        request.put("surname", "Trakulmaiphol");
        request.put("department", "IT");
        request.put("faculty", "SIT");
        request.put("year", new Long(3));
        
        Student expResult = new Student(59130500097l, "Supakorn", "Trakulmaiphol", "IT", "SIT", 3);
        Student result = registerService.parseStudent(request);
        assertEquals(expResult, result);
    }

    /**
     * Test of isStudentYearMeetRequirement method, of class RegisterService.
     */
    //@Test
    public void testIsStudentYearMeetRequirement() {
        System.out.println("isStudentYearMeetRequirement");
        Student student = null;
        ArrayList<Integer> selectedSubjectId = null;
        RegisterService instance = new RegisterService();
        boolean expResult = false;
        boolean result = instance.isStudentYearMeetRequirement(student, selectedSubjectId);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerSubjectToStudentIfAvaiable method, of class RegisterService.
     */
 
}
