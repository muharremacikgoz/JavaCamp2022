/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week2homework.inheritancedemo;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class main {

    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.calculateCredit(new MilitaryCreditManager());
    }

}
