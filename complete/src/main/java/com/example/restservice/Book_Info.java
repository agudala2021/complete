package com.example.restservice;

public class Book_Info {

    private String BookTitle;
    private String Author;
    private String Publisher;
    private String ISBN;
    private String Publishing_Year;
    private String Cost;

    public Book_Info(String bookTitle, String author, String publisher, String ISBN, String publishing_Year, String cost) {
        this.BookTitle = bookTitle;
        this.Author = author;
        this.Publisher = publisher;
        this.ISBN = ISBN;
        this.Publishing_Year = publishing_Year;
        this.Cost = cost;
    }

    public String getBookTitle() { return BookTitle;}
    public void setBookTitle(String bookTitle) { BookTitle = bookTitle; }

    public String getAuthor() { return Author; }
    public void setAuthor(String author) { Author = author; }

    public String getPublisher() { return Publisher; }
    public void setPublisher(String publisher) { Publisher = publisher; }

    public String getISBN() { return ISBN; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }

    public String getPublishing_Year() { return Publishing_Year; }
    public void setPublishing_Year(String publishing_Year) { Publishing_Year = publishing_Year; }

    public String getCost() { return Cost; }
    public void setCost(String cost) { Cost = cost; }

}
