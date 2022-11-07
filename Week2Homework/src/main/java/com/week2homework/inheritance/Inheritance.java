/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week2homework.inheritance;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Inheritance {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();
        customerManager.add();
        customerManager.list();

        employeeManager.BestEmployee();
        employeeManager.add();
        employeeManager.list();
    }
}
