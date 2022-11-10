/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework3.dataAccess;

import com.week3homework3.entities.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class HibernateCourseDao implements CourseDao {

    List<Course> courses = new ArrayList<Course>();

    @Override
    public void add(Course course) {
        courses.add(course);
    }

    @Override
    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public void getCourse() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
