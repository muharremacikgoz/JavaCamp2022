/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework3.dataAccess;

import com.week3homework3.entities.Instructor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class HibernateInstructorDao implements InstructorDao {

    List<Instructor> instructors = new ArrayList<Instructor>();

    @Override
    public void add(Instructor instructor) {
        instructors.add(instructor);
    }

    @Override
    public List<Instructor> getInstructors() {
        return instructors;
    }

    @Override
    public void getInstructor() {
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
