/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week1homework;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class MiniProjects {

    public static void arkadasSayilar() {
        int number1, number2, total1 = 0, total2 = 0;
        number1 = 220;
        number2 = 284;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 += i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                total2 += i;
            }
        }
        if (number1 == total2 && number2 == total1) {
            System.out.println("Arkadaş sayıdır");
        } else {
            System.out.println("Arkadaş sayı değildir");
        }
    }

    public static void sayiBulmaca() {
        int[] numbers = new int[]{1, 2, 3, 5, 7, 9, 0};
        int finding = 11;
        boolean result = false;

        for (int i = 0; i < numbers.length; i++) {
            if (finding == numbers[i]) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("Sayı dizide mevcut");
        } else {
            System.out.println("Sayı dizide mevcut değil");
        }
    }

    public static void sesliHarf() {
        char character = 'a';
        switch (character) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın sesli harf");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("İnce sesli harf");
                break;
            default:
                System.out.println("Sessiz harf");
        }
    }

    public static void mukemmelSayi() {
        int number = 28;
        int sumofdivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumofdivisors += i;
            }
        }
        if (sumofdivisors == number) {
            System.out.println("Mükemmel sayı");
        } else {
            System.out.println("Mükemmel sayı değil");
        }
    }

    public static void asalSayi() {
        int number = 97;
        int counter = 0;
        /*
        if (number == 1) {
            System.out.println("Asal değil");
        }
         */
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                counter += 1;
            }
        }

        if (counter == 1) {
            System.out.println("Asal sayı");
        } else if (number < 1) {
            System.out.println("Geçersiz sayı");
        } else {
            System.out.println("Asal değil");
        }
    }
}
