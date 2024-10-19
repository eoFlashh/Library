package com.eu.biblioteca.modules;

public class Book {
    public String title;
    public String author;
    public String isbn;
    public int year;
    public int quantity;

    public Book(String title, String author, String isbn, int year, int quantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year=" + year +
                ", quantity=" + quantity +
                '}';
    }

    public void info(){
        System.out.printf("\nBook: %s\nAuthor: %s\nISBN: %s\nYear: %d\nQuantity: %d\n", title, author, isbn, year, quantity);
    }
}
