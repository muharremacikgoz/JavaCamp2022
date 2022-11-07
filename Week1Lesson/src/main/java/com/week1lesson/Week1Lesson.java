/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.week1lesson;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Week1Lesson {

    // main javada başlangıç noktasıdır.
    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*
        ** Değişken isimlendirmeleri java'da camelCase yazılır. 
        ** CamelCase : Değişken isimlendirirken ilk kelimenin tamamı küçük harf sonraki kelimelerin ilk harflarinin büyük yazılmasıdır.
        ** Örnek : ortaMetin, altMetin
         */
        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade süresi";
        System.out.println(ortaMetin);

        // Integer
        int vade = 12;
        double dolarDun = 18.25;
        double dolarBugun = 18.30;
        String okYonu = "";

        boolean dolarDustuMu = false;
        if (dolarBugun < dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        /*
        String kredi1 ="Hızlı Kredi";
        String kredi2 ="Kredi X";
        String kredi3 ="Kredi Y";
         */
        String[] krediler = {"Hızlı Kredi", "Maaşını Halkbantan", "Mutlu Emekli"};

        /*
        System.out.println(krediler[0]);
        System.out.println(krediler[1]);
        System.out.println(krediler[2]);
         */
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }

    }
}
