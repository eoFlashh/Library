package com.eu.biblioteca.modules;

import java.util.Arrays;

public class Library {
    public String name;
    public String location;
    public Book[] list;

    public Library(String name, String location) {
        this.list = new Book[3];
        this.name = name;
        this.location = location;
    }

    public boolean checkAvailability(String title) {
        boolean flag = false;

        for (int i = 0; i < list.length; i++) {
            if (list[i].title.equals(title) && list[i].quantity >= 1) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("\nBook in stock");
            return true;
        } else {
            System.out.println("\nWe do not have this book in stock");
            return false;
        }
    }

    public void addBook(Book book) {
        boolean flag = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = book;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("\nBook in added");
        } else {
            System.out.println("\nthe library is fully full");
        }
    }

    public void findBookTitle(String title) {
        boolean flag = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i].title.equals(title)) {
                list[i].info();
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("\nBook not found");
        }
    }

    public void findBookAuthor(String author) {
        boolean flag = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i].author.equals(author)) {
                list[i].info();
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("\nAuthor not found");
        }
    }

    public void returnBook(String title, User user) {
        boolean flagLibrary = false;
        boolean flagUser = false;

        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].title.equals(title)) {
                flagLibrary = true;
                break;
            }
        }

        if (flagLibrary) {
            for (int i = 0; i < user.books.length; i++) {
                if (user.books[i] != null && user.books[i].title.equals(title)) {
                    flagUser = true;
                    user.books[i] = null;
                    user.quantity--;
                    break;
                }
            }

            if (flagUser) {
                for (int i = 0; i < list.length; i++) {
                    if (list[i] != null && list[i].title.equals(title)) {
                        list[i].quantity += 1;
                        break;
                    }
                }
                System.out.println("\nBook returned");
            } else {
                System.out.println("\nThe user does not have this book");
            }
        } else {
            System.out.println("\nBook not found");
        }
    }

    public void lendBook(String title, User user) {
        boolean flag = false;

        if (user.quantity >= 5) {
            System.out.println("\nUser has reached the limit of borrowed books");
            return;
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].title.equals(title)) {
                if (list[i].quantity >= 1) {
                    list[i].quantity -= 1;
                    user.addBook(list[i]);
                    flag = true;
                    break;
                } else {
                    System.out.println("\nNo more copies available");
                    return;
                }
            }
        }

        if (flag) {
            System.out.println("\nBorrowed book");
        } else {
            System.out.println("\nIt was not possible to lend the book");
        }
    }

    public void info(){
        System.out.printf("\nName: %s\nlocation: %s\nBooks:", name, location);
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                list[i].info();
            }
        }
    }
}
