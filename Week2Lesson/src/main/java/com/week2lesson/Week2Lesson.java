/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.week2lesson;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Week2Lesson {

    public static void main(String[] args) {
        String mesaj = "Vade Oranı";
        // set value
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("bilmemne.jpg");
        //System.out.println(product1.name);

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitsInStock(2);
        product2.setImageUrl("bilmemne2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(4);
        product3.setImageUrl("bilmemne3.jpg");

        Product[] products = {product1, product2, product3};
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndivitdualCustomer indivitdualCustomer = new IndivitdualCustomer();
        indivitdualCustomer.setId(1);
        indivitdualCustomer.setPhone("05222222222");
        indivitdualCustomer.setCustomerNumber("12345");
        indivitdualCustomer.setFirstName("Engin");
        indivitdualCustomer.setLastName("Demiroğ");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("11111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customer = {indivitdualCustomer, corporateCustomer};

    }
}
