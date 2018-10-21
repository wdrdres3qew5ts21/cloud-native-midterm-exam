/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective.service;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author wdrdr
 */
@Entity
public class Subject {

    @Id
    private String courseId;

    private String courseName;

    private String lecturer;

    private int maxStudentEnrollment;

    private int currentStudentEnrollment;

    public Subject() {

    }

    public Subject(String courseId, String courseName, String lecturer, int maxStudentEnrollment, int currentStudentEnrollment) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.lecturer = lecturer;
        this.maxStudentEnrollment = maxStudentEnrollment;
        this.currentStudentEnrollment = currentStudentEnrollment;
    }
    
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public int getMaxStudentEnrollment() {
        return maxStudentEnrollment;
    }

    public void setMaxStudentEnrollment(int maxStudentEnrollment) {
        this.maxStudentEnrollment = maxStudentEnrollment;
    }

    public int getCurrentStudentEnrollment() {
        return currentStudentEnrollment;
    }

    public void setCurrentStudentEnrollment(int currentStudentEnrollment) {
        this.currentStudentEnrollment = currentStudentEnrollment;
    }

    @Override
    public String toString() {
        return "Subject{" + "courseId=" + courseId + ", courseName=" + courseName + ", lecturer=" + lecturer + ", maxStudentEnrollment=" + maxStudentEnrollment + ", currentStudentEnrollment=" + currentStudentEnrollment + '}';
    }
    
    
    
    

}
