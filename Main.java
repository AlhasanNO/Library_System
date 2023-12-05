/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TTC
 */
public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        int choice;
        boolean authorFound = false;

        System.out.println("Menu:"
                + "\n1. Add a book"
                + "\n2. Add a student"
                + "\n3. Search book by title"
                + "\n4. Search book by author"
                + "\n5. Search book by number"
                + "\n6. Check book availability"
                + "\n7. Books loaned"
                + "\n8. Exit"
                + "\nEnter your choice: ");
        choice = scanner.nextInt();

        do {
            switch (choice) {
                case 1:
                    System.out.println("Enter book title: ");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    System.out.println("Enter author name: ");
                    String bAuthorName = scanner.nextLine();
                    for (Book book : library.getBooks()) {
                        if (book.getAuthor().getName().equalsIgnoreCase(bAuthorName)) {
                            Author existingAuthor = book.getAuthor();

                            System.out.println("Enter book number: ");
                            int bookNo = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter genre: ");
                            String genre = scanner.nextLine();
                            System.out.println("Enter book edition: ");
                            int edition = scanner.nextInt();
                            scanner.nextLine();
                            Date date = null;
                            while (date == null) {
                                System.out.println("Enter publication date (dd/MM/yyyy): ");
                                String inputDate = scanner.nextLine();
                                try {
                                    date = dateFormat.parse(inputDate);
                                } catch (ParseException e) {
                                    System.out.println("Please enter the date in the correct format (dd/MM/yyyy).");
                                }
                            }

                            Book newBook = new Book(bookNo, title, existingAuthor, date, genre, edition);
                            library.addBook(newBook);
                            System.out.println("Book added successfully!");

                            authorFound = true;
                            break;
                        }
                    }

                    if (!authorFound) {
                        System.out.println("Enter author ID: ");
                        int authorId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter author address: ");
                        int authorAddress = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter author birth date (dd/MM/yyyy): ");
                        Date authorBirthDate = null;
                        while (authorBirthDate == null) {
                            String inputDate = scanner.nextLine();
                            try {
                                authorBirthDate = dateFormat.parse(inputDate);
                            } catch (ParseException e) {
                                System.out.println("Please enter the date in the correct format (dd/MM/yyyy)");
                            }
                        }

                        System.out.println("Enter book number: ");
                        int bookNo = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter genre: ");
                        String genre = scanner.nextLine();
                        System.out.println("Enter book edition: ");
                        int edition = scanner.nextInt();
                        scanner.nextLine();
                        Date date = null;
                        while (date == null) {
                            System.out.println("Enter publication date (dd/MM/yyyy): ");
                            String inputDate = scanner.nextLine();
                            try {
                                date = dateFormat.parse(inputDate);
                            } catch (ParseException e) {
                                System.out.println("Please enter the date in the correct format (dd/MM/yyyy).");
                            }
                        }

                        Author author = new Author(authorId, bAuthorName, authorAddress, authorBirthDate);
                        Book newBook = new Book(bookNo, title, author, date, genre, edition);
                        library.addBook(newBook);
                        System.out.println("Book added successfully!");
                    }
                    break;

                case 2:
                    System.out.println("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    System.out.println("Enter student name: ");
                    scanner.nextLine();
                    String studentName = scanner.nextLine();
                    System.out.println("Enter student address: ");
                    int studentAddress = scanner.nextInt();
                    System.out.println("Enter student major: ");
                    scanner.nextLine();
                    String studentMajor = scanner.nextLine();
                    System.out.println("Enter student birth date (dd/MM/yyyy): ");
                    Date studentBirthDate = null;
                    while (studentBirthDate == null) {
                        String inputDate = scanner.nextLine();
                        try {
                            studentBirthDate = dateFormat.parse(inputDate);
                        } catch (ParseException e) {
                            System.out.println("Please enter the date in the correct format (dd/MM/yyyy)");
                        }
                    }
                    Student newStudent = new Student(studentId, studentName, studentAddress, studentBirthDate, studentMajor);
                    library.addStudent(newStudent);
                    System.out.println("Student added successfully!");
                    break;

                case 3:
                    System.out.println("Enter book title: ");
                    scanner.nextLine();
                    String bookTitle = scanner.nextLine();
                    Book foundByTitle = library.searchByTitle(bookTitle);
                    if (foundByTitle != null) {
                        System.out.println("Book found: " + foundByTitle.getInfo());
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter author name: ");
                    scanner.nextLine();
                    String sAuthorName = scanner.nextLine();
                    List<Book> foundByAuthorName = library.searchByAutherName(sAuthorName);
                    if (!foundByAuthorName.isEmpty()) {
                        System.out.println("Books found by author:");
                        for (Book book : foundByAuthorName) {
                            System.out.println(book.getInfo());
                        }
                    } else {
                        System.out.println("No books found by the author");
                    }
                    break;

                case 5:
                    System.out.println("Enter book number: ");
                    int no = scanner.nextInt();
                    Book foundByNo = library.searchByNo(no);
                    if (foundByNo != null) {
                        System.out.println("Book found: " + foundByNo.getInfo());
                    } else {
                        System.out.println("Book not found");
                    }
                    break;
                case 6:
                    System.out.println("Enter book title to check availability: ");
                    scanner.nextLine();
                    String titleCheck = scanner.nextLine();
                    Book bookCheck = library.searchByTitle(titleCheck);
                    if (bookCheck != null) {
                        if (library.checkBookAvailability(bookCheck)) {
                            System.out.println("Book is available");
                        } else {
                            System.out.println("Book is on loan.");
                        }
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 7:
                    System.out.println("Books on loan:");
                    library.checkLoans();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 8);
    }
}
