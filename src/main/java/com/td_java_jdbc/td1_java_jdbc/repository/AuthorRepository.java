package com.td_java_jdbc.td1_java_jdbc.repository;

import com.td_java_jdbc.td1_java_jdbc.model.Author;

import java.util.List;

public interface AuthorRepository {
    List<Author> getAllAuthor();
    List<Author> getAuthorById(int id);
    List<Author> addAuthors(Author author);
    List<Author> updateAuthor(Author author);
    void deleteAuthor(int id);
}
