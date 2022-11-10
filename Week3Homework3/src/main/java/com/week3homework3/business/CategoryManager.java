/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework3.business;

import com.week3homework3.core.logging.Logger;
import com.week3homework3.dataAccess.CategoryDao;
import com.week3homework3.entities.Category;
import java.util.List;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class CategoryManager {

    private CategoryDao categoryDao;
    private List<Logger> loggers;

    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        boolean isValid = false;
        for (Category category1 : categoryDao.getCategories()) {
            if (category1.getName().equals(category.getName())) {
                isValid = true;
            }
        }
        if (isValid) {
            System.out.println("Kategori mevcut olduğundan tekrar eklenemez");
        } else {
            categoryDao.add(category);
            for (Logger logger : loggers) {
                logger.add(category.getName());
            }
        }

    }

    public List<Category> getCategories() {
        return categoryDao.getCategories();
    }
}
