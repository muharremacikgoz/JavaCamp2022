/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework3.core.logging;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class FileLogger implements Logger {

    @Override
    public void add(String data) {
        System.out.println("File to logged : Ekleme yapıldı. : " + data);
    }

    @Override
    public void delete(String data) {
        System.out.println("File to logged : Silme yapıldı. : " + data);
    }

    @Override
    public void read(String data) {
        System.out.println("File to logged : Listeleme yapıldı. : " + data);
    }

    @Override
    public void update(String data) {
        System.out.println("File to logged : Güncelleme yapıldı. : " + data);
    }

}
