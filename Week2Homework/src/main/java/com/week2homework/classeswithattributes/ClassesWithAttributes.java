/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week2homework.classeswithattributes;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class ClassesWithAttributes {
    public static void main(String[] args) {
         Product product = new Product(1, "Asus Laptop", "Güzel bilgisayar", 3000, 3);

        /*Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("MSI Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);*/

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

            System.out.println(product.setKod());
    }
}
