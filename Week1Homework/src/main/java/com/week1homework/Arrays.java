/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week1homework;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Arrays {

    public static void array() {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Efe";
        String ogrenci3 = "Muharrem";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("------------------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Muharrem";
        ogrenciler[1] = "Efe";
        ogrenciler[2] = "Ahmet";
        ogrenciler[3] = "Meltem";
        //ogrenciler[4] = "Emir";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("--------------------------");

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }

    public static void multiDimensionalArrays() {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }

    public static void arrayDemo() {
        // double[] mylist=new double[4];
        double[] mylist = {0.2, 2.1, 2.7, 27.9};
        double total = 0;
        double max = mylist[0];
        double min = mylist[0];

        for (double number : mylist) {
            System.out.println(number);
            total += number;
            if (max < number) {
                max = number;
            }
            if (max > number) {
                min = number;
            }
        }

        System.out.println("Toplam : " + total);
        System.out.println("En Büyük : " + max);
        System.out.println("En Küçük : " + min);
    }

}
