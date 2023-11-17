package com.td_java_jdbc.td1_java_jdbc.service;

import com.td_java_jdbc.td1_java_jdbc.model.Book;

import java.util.List;

public interface BookServiceInterface {
    List<Book> getAllBooks();
    List<Book> getBookById(int id);
    List<Book> addBook(Book book);
    List<Book> updateBook(Book book);
    void deleteBook(int id);
}
