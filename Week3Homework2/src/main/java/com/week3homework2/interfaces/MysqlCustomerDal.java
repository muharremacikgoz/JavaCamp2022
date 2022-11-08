/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework2.interfaces;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class MysqlCustomerDal implements ICustomerDal {

    @Override
    public void add() {
        System.out.println("Mysql veritabanına eklendi");
    }
}
