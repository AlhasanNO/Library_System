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
public class Magazine extends Book {

    private int issueNo;
    private Date releaseDate;
    private boolean onLoan;

    public Magazine(int no, String title, Author author, Date date, String genre, int edition, int issueNo, Date releaseDate) {
        super(no, title, author, date, genre, edition);
        this.issueNo = issueNo;
        this.releaseDate = releaseDate;
        this.onLoan = false;
    }

    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean inLoan() {
        return onLoan;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nIssue No: " + issueNo + "\nRelease Date: " + releaseDate;
    }
}
