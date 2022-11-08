/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework2.abstratClasses;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public abstract class GameCalculator {

    public abstract void calculate();

    public final void gameOver() {
        System.out.println("Oyun bitti");
    }
}
