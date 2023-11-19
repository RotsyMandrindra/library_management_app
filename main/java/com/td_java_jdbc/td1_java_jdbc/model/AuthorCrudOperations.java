package main.java.com.td_java_jdbc.td1_java_jdbc.model;

import com.td_java_jdbc.td1_java_jdbc.model.Author;

import java.util.List;

public class AuthorCrudOperations implements CrudOperations<com.td_java_jdbc.td1_java_jdbc.model.Author> {

    @Override
    public List<com.td_java_jdbc.td1_java_jdbc.model.Author> findAll() {
        // Implémentation pour récupérer tous les auteurs
        return null;
    }

    @Override
    public List<com.td_java_jdbc.td1_java_jdbc.model.Author> saveAll(List<com.td_java_jdbc.td1_java_jdbc.model.Author> toSave) {
        // Implémentation pour sauvegarder une liste d'auteurs
        return null;
    }

    @Override
    public Book save(Author toSave) {
        return null;
    }

    public List<com.td_java_jdbc.td1_java_jdbc.model.Author> AuthorCrudOperations(Author toSave) {
        return null;
    }

    @Override
    public void delete(Author toDelete) {
        return null;
    }
}
