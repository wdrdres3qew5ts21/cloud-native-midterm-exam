/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective.service;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
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
public class RegisterController {

    @GetMapping("/")
    public String helloWorld() {
        long id = 59130500097l;
        return "Hello World Son!!!" + id;
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id) {
        System.out.println("Student ID : " + id);
        Student student = new Student(59130500097l, "Supakorn", "Trakulmaiphol", "IT", "SIT", 3);
        return student;
    }

    @GetMapping("/student")
    public Object get(@PathVariable String id) {
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
