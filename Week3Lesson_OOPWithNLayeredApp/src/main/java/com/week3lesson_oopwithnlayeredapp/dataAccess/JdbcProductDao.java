/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3lesson_oopwithnlayeredapp.dataAccess;

import com.week3lesson_oopwithnlayeredapp.entities.Product;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class JdbcProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
