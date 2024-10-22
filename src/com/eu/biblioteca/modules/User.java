package com.eu.biblioteca.modules;

import java.util.Arrays;

public class User {
    public String name;
    public String id;
    public String email;
    public Book[] books;
    public int quantity;

    public User(String name, String id, String email, Book[] books) {
        if (books.length > 5) {
            System.out.println("\nYou book limit is 5");
            this.books = new Book[5];
            quantity = 0;
        } else {
            this.books = books;
            for (int i = 0; i < books.length; i++) {
                if (books[i] != null) {
                    quantity += books[i].quantity;
                }
            }
            if (quantity > 5) {
                System.out.println("\nYou book limit is 5");
                this.books = new Book[5];
                quantity = 0;
            } else {
                this.books = books;
                this.quantity = quantity;
            }
        }

        this.name = name;
        this.id = id;
        this.email = email;
    }

    public User(String name, String id, String email) {
        this.books = new Book[5];
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public void info() {
        System.out.printf("\nName: %s\nId: %s\nEmail: %s\nBooks: %d", name, id, email, quantity);
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                books[i].info();
            }
        }
    }

    public void addBook(Book book) {
        if (quantity < 5) {
            for (int i = 0; i < books.length; i++) {
                if (books[i] == null) {
                    books[i] = book;
                    books[i].quantity += book.quantity;
                    quantity++;
                    break;
                }
            }
        }
    }
}
