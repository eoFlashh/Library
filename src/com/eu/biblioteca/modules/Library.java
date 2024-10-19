package com.eu.biblioteca.modules;

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
            System.out.println("Book in stock");
            return true;
        }else {
            System.out.println("We do not have this book in stock");
            return false;
        }
    }

    public void addBook(Book book) {
        boolean flag = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null){
                list[i] = book;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Book in added");
        }
        else {
            System.out.println("the library is fully full");
        }
    }

}
