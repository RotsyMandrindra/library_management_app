package com.td_java_jdbc.td1_java_jdbc.service;

import com.td_java_jdbc.td1_java_jdbc.model.Book;
import com.td_java_jdbc.td1_java_jdbc.repository.BookRepository;

import java.util.List;

public class BookService implements BookServiceInterface{
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAllBook();
    }

    @Override
    public List<Book> getBookById(int id) {
        return bookRepository.getBooksById(id);
    }

    @Override
    public List<Book> addBook(Book book) {
        bookRepository.addBooks(book);
        return bookRepository.getAllBook();
    }

    @Override
    public List<Book> updateBook(Book book) {
        bookRepository.updateBook(book);
        return bookRepository.getAllBook();
    }

    @Override
    public void deleteBook(int id) {
        bookRepository.deleteBook(id);
    }
}
