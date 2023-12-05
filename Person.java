/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.Date;

/**
 *
 * @author TTC
 */
public class Person implements Display {

    private int id;
    private String name;
    private int address;
    private Date birthDate;
    private boolean onLoan;

    public Person(int id, String name, int address, Date birthDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
    }
    public Person(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean inLoan() {
        return onLoan;
    }

    @Override
    public String getInfo() {
        return "ID: " + id + "\nName: " + name + "\nAddress: " + address + "\nDate of birth: " + birthDate;
    }
}
