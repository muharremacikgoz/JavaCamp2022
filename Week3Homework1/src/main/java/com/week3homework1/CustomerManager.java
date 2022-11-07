/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework1;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class CustomerManager {

    private Customer customer;
    private ICreditManager creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager) {
        this.customer = customer;
        this.creditManager = creditManager;
    }

    public void save() {
        System.out.println("Müşteri kaydedildi");
    }

    public void delete() {
        System.out.println("Müşteri silindi");
    }

    public void giveCredit() {
        creditManager.Calculate();
        System.out.println("Kredi verildi");
    }
}
