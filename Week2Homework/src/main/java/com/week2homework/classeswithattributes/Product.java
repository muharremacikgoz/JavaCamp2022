/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week2homework.classeswithattributes;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Product {

    public Product(int id, String name, String description, double price, int stockAmount) {
        System.out.println("yapıcı metod çalıştı.");
        this.name = name;
        this.id = id;
    }

    public Product() {

    }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the stockAmount
     */
    public int getStockAmount() {
        return stockAmount;
    }

    /**
     * @param stockAmount the stockAmount to set
     */
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    /**
     * @return the kod
     */
    public String getKod() {
        return kod;
    }

    /**
     * @param kod the kod to set
     */
    public String setKod() {
        return this.name.substring(0, 1) + id;
    }
}
