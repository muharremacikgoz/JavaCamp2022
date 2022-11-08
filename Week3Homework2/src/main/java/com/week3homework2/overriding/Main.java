/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework2.overriding;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Main {
    
    public static void main(String[] args) {
        BaseCreditManager[] baseCreditManagers = new BaseCreditManager[]{new StudentCreditManager(), new FarmCreditManager(), new MilitaryCreditManager(), new TeacherCreditManager()};
        for (BaseCreditManager baseCreditManager : baseCreditManagers) {
            System.out.println(baseCreditManager.calculate(1000));
        }
    }
}
