/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.week3homework3;

import com.week3homework3.business.CategoryManager;
import com.week3homework3.business.CourseManager;
import com.week3homework3.business.InstructorManager;
import com.week3homework3.core.logging.DatabaseLogger;
import com.week3homework3.core.logging.Logger;
import com.week3homework3.core.logging.MailLogger;
import com.week3homework3.dataAccess.HibernateCategoryDao;
import com.week3homework3.dataAccess.HibernateCourseDao;
import com.week3homework3.dataAccess.HibernateInstructorDao;
import com.week3homework3.dataAccess.JdbcCategoryDao;
import com.week3homework3.dataAccess.JdbcInstructorDao;
import com.week3homework3.entities.Category;
import com.week3homework3.entities.Course;
import com.week3homework3.entities.Instructor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Week3Homework3 {

    public static void main(String[] args) throws Exception {
        List<Logger> loggers = new ArrayList<Logger>();
        loggers.add(new DatabaseLogger());
        loggers.add(new MailLogger());

        Category category = new Category();
        category.setId(1);
        category.setName("Programlama");
        Category category1 = new Category();
        category1.setId(2);
        category1.setName("Programlama");

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        List<Category> categories1 = new ArrayList<Category>();
        categories1 = categoryManager.getCategories();
        for (Category category3 : categories1) {
            System.out.println(category3.getId() + " - " + category3.getName());
        }
        categoryManager.add(category);
        categoryManager.add(category1);
        List<Category> categories = new ArrayList<Category>();
        categories = categoryManager.getCategories();
        for (Category category2 : categories) {
            System.out.println(category2.getId() + " - " + category1.getName());
        }
/*      Eğitmen       */
        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Muharrem");
        instructor.setLastName("AÇIKGÖZ");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
        instructorManager.add(instructor);

        Course course = new Course(1, "Java YGYK", "Java", 100, 1, 1);
        CourseManager courseManager=new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course);
        courseManager.add(course);
    }
}
