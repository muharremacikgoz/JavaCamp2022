/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week1homework;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Loops {

    public static void whileLoop() {
        int number = 0, total = 0;
        while (number <= 27) {
            total = total + number;
            number += 1;
        }
        System.out.println("1'den 27 kadar olan sayıların toplamı : " + total);
    }

    public static void doWhileLoop() {
        int x = 100;
        do {
            System.out.println("Loglandı");
            System.out.println(x);
            x += 2;
        } while (x < 27);
        System.out.println("Döngü sonlandı");
    }

    public static void forLoop() {
        String name = "Bilgisayar";
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " " + i);
        }
    }
}
