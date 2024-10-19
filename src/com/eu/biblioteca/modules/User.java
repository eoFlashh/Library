package com.eu.biblioteca.modules;

public class User {
    public String name;
    public String id;
    public String email;
    public Book[] books;

    public User(String name, String id, String email, Book[] books) {
        if (books.length == 2) {
            System.out.println("You book limit is 5");
            this.books = new Book[2];
        } else {
            this.books = books;
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
        System.out.printf("\nName: %s\nId: %s\nEmail: %s\n", name, id, email);
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                books[i].info();
            }
        }
    }
}
