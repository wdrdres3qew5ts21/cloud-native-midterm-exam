/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective.student;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sit.freeelective.FreeElective.subject.Subject;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.xml.ws.BindingType;

/**
 *
 * @author wdrdr
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "password"})
public class Student implements Serializable {

    @Id
    private long studentId;

    private String password;

    private String name;

    private String surname;

    private String department;

    private String faculty;

    private int year;

    @ManyToMany(mappedBy = "students",
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    private List<Subject> subject;

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", name=" + name + ", surname=" + surname + ", department=" + department + ", faculty=" + faculty + ", year=" + year + '}';
    }

}
