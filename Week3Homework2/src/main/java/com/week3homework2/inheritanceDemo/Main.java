/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework2.inheritanceDemo;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Main {

    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.creditCalculate(new MilitaryCreditManager());
    }
}
