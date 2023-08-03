package com.xuange.spring6.iocxml.di;


//依赖注入： setter and constructor

public class Book {
    private String bname;
    private String author;

    public Book(){
        System.out.println("No argument Constructor is doing his thing.....");
    };

    public Book(String bname, String author) {
        this.bname = bname;
        this.author = author;
        System.out.println("Constructor is doing his thing......");
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
