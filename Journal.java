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
public class Journal extends Book {

    private int conferenceNO;
    private String conferenceName;
    private boolean onLoan;

    public Journal(int no, String title, Author author, Date date, String genre, int edition, int conferenceNo, String conferenceName) {
        super(no, title, author, date, genre, edition);
        this.conferenceNO = conferenceNo;
        this.conferenceName = conferenceName;
        this.onLoan = false;
    }

    public int getConferenceNO() {
        return conferenceNO;
    }

    public void setConferenceNO(int conferenceNO) {
        this.conferenceNO = conferenceNO;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    @Override
    public boolean inLoan() {
        return onLoan;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "/nConference NO: " + conferenceNO + "/nConference Name: " + conferenceName;
    }

}
