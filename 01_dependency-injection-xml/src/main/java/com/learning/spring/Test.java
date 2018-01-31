package com.learning.spring;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");

        String dateToParse = "2018-01-08T10:55:53+07:00";
        Date date = df.parse(dateToParse);

        String reportDate = df.format(date);

        System.out.println("Report Date: " + reportDate  + ":00");
    }
}
