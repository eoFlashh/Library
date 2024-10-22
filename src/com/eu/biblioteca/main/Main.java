package com.eu.biblioteca.main;

import com.eu.biblioteca.modules.Book;
import com.eu.biblioteca.modules.Library;
import com.eu.biblioteca.modules.User;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Teste", "teste", "123141", 2021, 1);
        Book book2 = new Book("Teste2", "teste2", "1231412", 2022, 1);
        Book book3 = new Book("Teste3", "teste", "1231413", 2023, 1);
        Book book4 = new Book("Teste4", "teste", "1231414", 2024, 1);
        Book[] books = {book1, book2, book3};
        Book[] books2 = {book1, book1, book1, book1, book1, book1};

        User user = new User("aa", "aaa", "aaa");
        user.info();

        User user2 = new User("aa2", "aaa2", "aaa2", books2);
        user2.info();

        Library library = new Library("library", "tomorrow");
        library.addBook(book4);
        library.addBook(book3);
        library.addBook(book3);
        library.addBook(book2);
        library.addBook(book1);

        library.checkAvailability("Teste4");
        library.checkAvailability("Teste3");

        library.findBookTitle("teste");
        library.findBookTitle("Teste4");
        library.findBookAuthor("teste");
        library.findBookAuthor("teste3");

        library.returnBook("Teste3", user);
        library.returnBook("Teste3", user);
        library.returnBook("OGUNAIOUYRGIOJUNG", user);

        user.info();

        library.lendBook("Teste3", user);
        library.lendBook("Teste3", user);
        library.lendBook("Teste3", user);
        library.lendBook("Teste3", user);
        user.info();

        for (int i = 0; i < user.books.length; i++) {
            if (user.books[i] !=  null){
                user.books[i].info();
            }
        }
    }
}
