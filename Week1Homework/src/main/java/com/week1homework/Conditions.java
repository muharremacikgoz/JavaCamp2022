/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week1homework;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Conditions {

    public static void ifConditions() {
        int grades = 67;
        if (grades > 70) {
            System.out.println("Geçtiniz");
        } else {
            System.out.println("Kaldınız");
        }
    }

    public static void switchConditions() {
        int grades = 5;

        switch (grades) {
            case 5:
                System.out.println("Pekiyi");
                break;
            case 4:
                System.out.println("İyi");
                break;
            case 3:
                System.out.println("Orta");
                break;
            case 2:
                System.out.println("Geçti");
                break;
            default:
                System.out.println("Kaldı");
        }
    }

    public static void get() {
        int number1 = 35, number2 = 28, number3 = 27;
        int bigNumber = number1;

        if (bigNumber < number2) {
            bigNumber = number2;
        }
        if (bigNumber < number3) {
            bigNumber = number3;
        }

        System.out.println("Büyük Sayı : " + bigNumber);
    }
}
