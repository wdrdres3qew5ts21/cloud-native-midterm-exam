/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective.service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.ws.BindingType;

/**
 *
 * @author wdrdr
 */
@Entity
public class Student {

    @Id
    private long studentId;
    
    private String password;

    private String name;

    private String surname;

    private String department;

    private String faculty;
    
    private int year;

    public Student() {

    }

    public Student(long studentId, String name, String surname, String department, String faculty, int year) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.faculty = faculty;
        this.year = year;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFaculty() {
        return faculty;
    }
    
    

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", name=" + name + ", surname=" + surname + ", department=" + department + ", faculty=" + faculty + ", year=" + year + '}';
    }
    
    

}
