package main.java.com.td_java_jdbc.td1_java_jdbc.model;

import com.td_java_jdbc.td1_java_jdbc.model.Author;
import com.td_java_jdbc.td1_java_jdbc.model.Book;

import java.util.List;

public class BookCrudOperations implements CrudOperations<com.td_java_jdbc.td1_java_jdbc.model.Book> {

    @Override
    public List<com.td_java_jdbc.td1_java_jdbc.model.Book> findAll() {
        return null;
    }

    @Override
    public List<com.td_java_jdbc.td1_java_jdbc.model.Book> saveAll(List<com.td_java_jdbc.td1_java_jdbc.model.Book> toSave) {
        return null;
    }

    @Override
    public Author save(Book toSave) {
        return null;
    }

    @Override
    public com.td_java_jdbc.td1_java_jdbc.model.Book delete(com.td_java_jdbc.td1_java_jdbc.model.Book toDelete) {
        return null;
    }
}
