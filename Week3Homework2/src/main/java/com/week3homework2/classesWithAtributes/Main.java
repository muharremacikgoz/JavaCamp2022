/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework2.classesWithAtributes;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Main {

    public static void main(String[] args) {

        Product product = new Product();
        product.setId(1);
        product.setName("MSI Leopard GP72");
        product.setPrice(3000);
        product.setDescription("MSI Laptop");
        product.setStockAmount(27);

        Product product1 = new Product(2, "MSI Leopard", "MSI Laptop 2", 5000, 3, "Siyah");

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getCode());
    }
}
