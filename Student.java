/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author TTC
 */
public class Student extends Person {

    private String major;
    private List<Book> booksLoaned;

    public Student(int id, String name, int address, Date birthDate, String major) {
        super(id, name, address, birthDate);
        this.major = major;
        this.booksLoaned = new ArrayList<>();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void loanBook(Book book) {
        if (booksLoaned.size() < 3) {
            booksLoaned.add(book);
            System.out.println(super.getName() + " has loaned " + book.getTitle());
        } else {
            System.out.println(super.getName() + " has reached the maximum limit of books loaned");
        }
    }

    @Override
    public boolean inLoan() {
        return booksLoaned.size() > 0;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nMajor: " + major + "\nBooks Loaned: " + booksLoaned;
    }
}
