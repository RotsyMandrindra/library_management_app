package com.td_java_jdbc.td1_java_jdbc.repository;

import com.td_java_jdbc.td1_java_jdbc.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBook();
    List<Book> getBooksById(int id);
    List<Book> addBooks(Book book);
    List<Book> updateBook(Book book);
    void deleteBook(int id);
}
