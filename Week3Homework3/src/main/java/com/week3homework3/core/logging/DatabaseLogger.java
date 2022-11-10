/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework3.core.logging;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class DatabaseLogger implements Logger {

    @Override
    public void add(String data) {
        System.out.println("Database to logged : " + data + " verisi eklendi.");
    }

    @Override
    public void delete(String data) {
        System.out.println("Database to logged : " + data + " verisi silindi.");
    }

    @Override
    public void read(String data) {
        System.out.println("Database to logged : " + data + " verisi listelendi.");
    }

    @Override
    public void update(String data) {
        System.out.println("Database to logged : " + data + " verisi güncellendi.");
    }

}
