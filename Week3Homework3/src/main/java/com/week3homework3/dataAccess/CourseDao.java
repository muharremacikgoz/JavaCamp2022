/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.week3homework3.dataAccess;

import com.week3homework3.entities.Course;
import java.util.List;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public interface CourseDao {
    
    void add(Course course);
    
    List<Course> getCourses();
    
    void getCourse();
    
    void update();
    
    void delete();
}
