/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week1homework;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Strings {

    public static void get() {
        String text = "Java, Sun Microsystems'den James Gosling tarafından geliştirilen bir programlama dilidir ve 1995 yılında Sun Microsystems'in çekirdek bileşeni olarak piyasaya sürülmüştür";
        char[] dizge = new char[18];
        System.out.println(text);
        System.out.println("Karakter Sayısı : " + text.length());
        text.getChars(6, 22, dizge, 0);

        for (char c : dizge) {
            System.out.print(c);
        }

        System.out.println("");
        System.out.println(text.startsWith("J"));
        System.out.println(text.endsWith("r"));
        System.out.println(text.indexOf("James"));
        System.out.println(text.lastIndexOf("ya"));
        System.out.println(text.substring(6, 22));

        for (String string : text.split(" ")) {
            System.out.println(string);
        }

        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.trim());
        System.out.println(text.replace(" ", "-"));

    }
}
