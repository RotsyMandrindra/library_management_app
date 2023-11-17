package com.td_java_jdbc.td1_java_jdbc.service;

import com.td_java_jdbc.td1_java_jdbc.model.Author;

import java.util.List;

public interface AuthorServiceInterface {
    List<Author> getAllAuthors();
    List<Author> getAuthorById(int id);
    List<Author> addAuthor(Author author);
    List<Author> updateAuthor(Author author);
    void deleteAuthor(int id);
}
