/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.week3homework1;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Week3Homework1 {

    public static void main(String[] args) {

//        ReferanceType.test();
//        CreditManager creditManager = new CreditManager();
//        creditManager.Calculate();
//        creditManager.Calculate();
//        creditManager.Save();
//
//        Customer customer = new Customer();
//        customer.setId(27);
//        customer.setCity("Aydın");
//
//        CustomerManager customerManager = new CustomerManager(customer);
//        customerManager.save();
//        customerManager.delete();
//
//        Company company = new Company();
//        company.setCompanyName("Beko");
//        company.setTaxNumber("100000");
//        company.setId(1);
//
//        CustomerManager customerManager2 = new CustomerManager(company);
//        //customerManager2.save();
//
//        Customer c1 = new Customer();
//        Customer c2 = new Company();
//        Customer c3 = new Person();
//        Sonar Qube
        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.giveCredit();

    }
}
