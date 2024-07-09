package org.koreait;

import java.time.LocalDate;

public class Motivation {
    private int id;
    private String body;
    private String writer;
    private String regDate;

    public Motivation(int id, String body, String writer, LocalDate regDate) {
        this.regDate = String.valueOf(regDate);
        this.id = id;
        this.body = body;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Motivation{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", writer='" + writer + '\'' +
                ", regDate='" + regDate + '\'' +
                '}';
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
