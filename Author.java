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
public class Author extends Person {

    public Author(int id, String name, int address, Date birthDate) {
        super(id, name, address, birthDate);
    }
    
    public Author(){}

    @Override
    public boolean inLoan() {
        return false;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
