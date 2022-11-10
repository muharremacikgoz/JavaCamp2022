/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework3.dataAccess;

import com.week3homework3.entities.Category;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class JdbcCategoryDao implements CategoryDao {

    private List<Category> categories = new ArrayList<Category>();

    @Override
    public void add(Category category) {
        categories.add(category);
    }

    @Override
    public List<Category> getCategories() {
        return categories;
    }

    @Override
    public void getCategory() {
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
