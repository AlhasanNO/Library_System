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
public class Book implements Display {

    private int no;
    private String title;
    private Author author;
    private Date date;
    private String genre;
    private int edition;
    private boolean onLoan;

    public Book(int no, String title, Author author, Date date, String genre, int edition) {
        this.no = no;
        this.title = title;
        this.author = author;
        this.date = date;
        this.genre = genre;
        this.edition = edition;
        this.onLoan = false;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public String getInfo() {
        return "NO: " + no + "\nTitle: " + title + "\nAuthor: " + author + "\nDate: " + date + "\nGenre: " + genre + "\nEdition: " + edition + "\nOn loan" + onLoan;
    }

    @Override
    public boolean inLoan() {
        return onLoan;
    }
}
