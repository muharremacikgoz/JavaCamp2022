/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework3.entities;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Course {

    private int id;
    private String name;
    private String tecnologies;
    private double price;
    private int instructorId;
    private int categoryId;

    public Course(int id, String name, String tecnologies, double price, int instructorId, int categoryId) {
        this.id = id;
        this.name = name;
        this.tecnologies = tecnologies;
        this.price = price;
        this.instructorId = instructorId;
        this.categoryId = categoryId;
    }

    public Course() {
    }
    
    

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
     * @return the tecnologies
     */
    public String getTecnologies() {
        return tecnologies;
    }

    /**
     * @param tecnologies the tecnologies to set
     */
    public void setTecnologies(String tecnologies) {
        this.tecnologies = tecnologies;
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
     * @return the instructorId
     */
    public int getInstructorId() {
        return instructorId;
    }

    /**
     * @param instructorId the instructorId to set
     */
    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    /**
     * @return the categoryId
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    
}
