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
public class Loan {

    private Book book;
    private Student student;
    private Date returnDate;

    public Loan(Book book, Student student, Date returnDate) {
        this.book = book;
        this.student = student;
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getInfo() {
        return "Loan information: " + "/nBook: " + book.getInfo() + "/nStudent: " + student.getInfo() + "/nReturn Date: " + returnDate;
    }
}
