/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework2.staticDemo;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class ProductManager {

    public void add(Product product) {
        ProductValidator productValidator = new ProductValidator();
        if (productValidator.isValid(product)) {
            System.out.println("Eklendi");
        } else {
            System.out.println("Eklenemedi");
        }

    }
}
