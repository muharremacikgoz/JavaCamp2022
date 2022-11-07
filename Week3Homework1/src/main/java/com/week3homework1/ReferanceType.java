/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework1;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class ReferanceType {

    public static void test() {
        // Değer Tip Örneği
        /*
        int number1 = 10;
        int number2 = 20;
        number1 = number2;
        number2 = 100;
        System.out.println(number1);
         */
        // Referans Tip Örneği
        int[] numbers1 = new int[]{1, 2, 3};
        int[] numbers2 = new int[]{10, 20, 30};

        numbers1 = numbers2;
        numbers2[0] = 1000;

        System.out.println(numbers2[0]);
    }
}
