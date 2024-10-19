package com.eu.biblioteca.main;

import com.eu.biblioteca.modules.Book;
import com.eu.biblioteca.modules.Library;
import com.eu.biblioteca.modules.User;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Teste", "teste", "123141", 2021, 1);
        Book book2 = new Book("Teste2", "teste2", "1231412", 2022, 2);
        Book book3 = new Book("Teste3", "teste3", "1231413", 2023, 3);
        Book book4 = new Book("Teste4", "teste4", "1231414", 2024, 0);
        Book[] books = {book1, book2, book3};
        Book[] books2 = {book1, book2};

        User user = new User("aa", "aaa", "aaa", books2);
        user.info();

        User user2 = new User("aa2", "aaa2", "aaa2", books);
        user2.info();

        Library library = new Library("library", "tomorrow");
        library.addBook(book4);
        library.addBook(book3);
        library.addBook(book2);
        library.addBook(book1);

        library.checkAvailability("Teste4");
        library.checkAvailability("Teste3");
    }
}
