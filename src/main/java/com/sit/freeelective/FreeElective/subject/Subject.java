/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective.subject;

import com.sit.freeelective.FreeElective.student.Student;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author wdrdr
 */
@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String courseId;

    private String courseName;

    private String lecturer;

    private int maxStudentEnrollment;

    private int currentStudentEnrollment;

//    private List<Student> students;

    public Subject() {

    }

    public Subject(int id, String courseId, String courseName, String lecturer, int maxStudentEnrollment) {
        this.id = id;
        this.courseId = courseId;
        this.courseName = courseName;
        this.lecturer = lecturer;
        this.maxStudentEnrollment = maxStudentEnrollment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Subject{" + "id=" + id + ", courseId=" + courseId + ", courseName=" + courseName + ", lecturer=" + lecturer + ", maxStudentEnrollment=" + maxStudentEnrollment + ", currentStudentEnrollment=" + currentStudentEnrollment + '}';
    }

}
