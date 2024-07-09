package org.koreait;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CurrentDateTime {
    public static void main(String[] args) {

        String dateTime = DateTimeFormatter.ofPattern("MM-dd-yyyy, hh:mm:ss")
                .format(LocalDateTime.now());

        System.out.println(dateTime);
    }
    }