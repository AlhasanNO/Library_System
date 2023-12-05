/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TTC
 */
public class Library {

    private List<Book> books;
    private List<Student> students;

    public Library() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    
    public void addBook(Book book) {
        books.add(book);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book searchByNo(int no) {
        for (Book book : books) {
            if (book.getNo() == no) {
                return book;
            }
        }
        return null;
    }

    public List<Book> searchByAutherName(String authorName) {
        List<Book> booksByAuthor = new ArrayList();
        for (Book book : books) {
            if (book.getAuthor().getName().equalsIgnoreCase(authorName)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public boolean checkBookAvailability(Book book) {
        return !book.inLoan();
    }

    public void checkLoans() {
        for (Book book : books) {
            if (!checkBookAvailability(book)) {
                System.out.println(book.getTitle() + " is on loan");
            }
        }
    }
}
