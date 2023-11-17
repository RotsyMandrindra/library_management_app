package com.td_java_jdbc.td1_java_jdbc.service;

import com.td_java_jdbc.td1_java_jdbc.model.Author;
import com.td_java_jdbc.td1_java_jdbc.repository.AuthorRepository;

import java.util.List;

public class AuthorService implements AuthorServiceInterface {

    private AuthorRepository authorRepository;
    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }
    public List<Author> getAllAuthors() {
        return authorRepository.getAllAuthor();
    }

    @Override
    public List<Author> getAuthorById(int id) {
        return authorRepository.getAuthorById(id);
    }

    @Override
    public List<Author> addAuthor(Author author) {
        authorRepository.addAuthors(author);
        return authorRepository.getAllAuthor();
    }

    @Override
    public List<Author> updateAuthor(Author author) {
        authorRepository.updateAuthor(author);
        return authorRepository.getAllAuthor();
    }

    @Override
    public void deleteAuthor(int id) {
        authorRepository.deleteAuthor(id);
    }
}
