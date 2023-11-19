package main.java.com.td_java_jdbc.td1_java_jdbc.model;

import java.util.List;

public interface CrudOperations<T> {
    List<T> findAll();
    List<T> saveAll(List<T> toSave);
    Book save(T toSave);
    void delete(T toDelete);
}
