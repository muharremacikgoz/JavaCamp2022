/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework3.business;

import com.week3homework3.core.logging.Logger;
import com.week3homework3.dataAccess.CourseDao;
import com.week3homework3.entities.Course;
import java.util.List;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class CourseManager {

    private CourseDao courseDao;
    private List<Logger> loggers;

    public CourseManager(CourseDao courseDao, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) {
        boolean isValidName = false;
        boolean isValidPrice = false;

        for (Course course1 : courseDao.getCourses()) {
            if (course1.getName().equals(course.getName())) {
                isValidName = true;
            }
        }

        if (course.getPrice() < 0) {
            System.out.println("Kurs fiyatı 0'dan küçük olamaz");
        } else if (isValidName) {
            System.out.println("Kurs mevcut olduğundan tekrar eklenemez");
        } else {
            courseDao.add(course);
            for (Logger logger : loggers) {
                logger.add(course.getName());
            }
        }

    }
}
