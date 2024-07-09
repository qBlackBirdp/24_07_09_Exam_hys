package org.koreait;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {
    public static void main(String[] args) {
        // 현재 날짜 구하기
        LocalDate now = LocalDate.now();
        // 포맷 정의
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatedNow = now.format(formatter);
        System.out.println(formatedNow);
    }
}