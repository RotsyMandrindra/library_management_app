package main.java.com.td_java_jdbc.td1_java_jdbc.model;

import com.td_java_jdbc.td1_java_jdbc.model.Author;

import java.util.List;

public interface CrudOperations<T> {
    List<T> findAll();
    List<T> saveAll(List<T> toSave);
    Author save(T toSave);
    T delete(T toDelete);
}
