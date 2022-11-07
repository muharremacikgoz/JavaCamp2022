/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3homework1;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Person extends Customer{

    private String firstName;
    private String lastName;
    private String nationalIdentity;

    
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the nationalIdentity
     */
    public String getNationalIdentity() {
        return nationalIdentity;
    }

    /**
     * @param nationalIdentity the nationalIdentity to set
     */
    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }
    
    
}
