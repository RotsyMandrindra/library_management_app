package com.td_java_jdbc.td1_java_jdbc.repository;

import com.td_java_jdbc.td1_java_jdbc.model.Write;

import java.util.List;

public interface WriteRepository {
    List<Write> getAllWrite();
    List<Write> getAllWriteById(int id);
    List<Write> addWrite(Write write);
    List<Write> updateWrite(Write write);
    void deleteWrite(int id);
}
