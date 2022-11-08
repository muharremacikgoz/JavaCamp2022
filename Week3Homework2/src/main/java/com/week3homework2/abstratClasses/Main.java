/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework2.abstratClasses;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Main {

    public static void main(String[] args) {
        
        WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
        womenGameCalculator.calculate();
        womenGameCalculator.gameOver();

        GameCalculator gameCalculator = new KidsGameCalculator();
        gameCalculator.calculate();
        gameCalculator.gameOver();
    }
}
