/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3lesson_oopwithnlayeredapp.core.logging;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class DatabaseLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Database to logged : " + data);
    }

}
