package com.geekster.WeeklyTest3.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class MailConstants {

    public static final String SENDER = "ajinkya12051999@gmail.com";
    public static final String SUBJECT = "Testing java \uD83D\uDCE7 mail  : \uD83D\uDCC6 - Date - " + LocalDate.now();


    public static final String RECEIVER = "ajinkya12051999@gmail.com";
}

