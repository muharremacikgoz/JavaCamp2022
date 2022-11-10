/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.week3homework3.dataAccess;

import com.week3homework3.entities.Category;
import java.util.List;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public interface CategoryDao {

    void add(Category category);

    List<Category> getCategories();
    
    void getCategory();

    void update();

    void delete();
}
