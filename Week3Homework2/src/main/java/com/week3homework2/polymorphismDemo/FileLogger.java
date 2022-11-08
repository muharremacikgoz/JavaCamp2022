/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework2.polymorphismDemo;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class FileLogger extends BaseLogger {

    public void log(String message) {
        System.out.println("Logged to file : " + message);
    }
}
