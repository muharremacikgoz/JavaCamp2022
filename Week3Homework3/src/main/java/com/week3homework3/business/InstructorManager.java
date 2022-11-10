/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework3.business;

import com.week3homework3.core.logging.Logger;
import com.week3homework3.dataAccess.InstructorDao;
import com.week3homework3.entities.Instructor;
import java.util.List;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class InstructorManager {

    private InstructorDao instructorDao;
    private List<Logger> loggers;

    public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        instructorDao.add(instructor);
        for (Logger logger : loggers) {
            logger.add(instructor.getFirstName() + " " + instructor.getLastName());
        }
    }
}
