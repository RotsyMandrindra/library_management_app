package com.td_java_jdbc.td1_java_jdbc.service;

import com.td_java_jdbc.td1_java_jdbc.model.Write;
import java.util.List;

public interface WriteServiceInterface {
    List<Write> getAllWrites();
    List<Write> getWriteById(int id);
    List<Write> addWrite(Write write);
    List<Write> updateVisitor(Write write);
    void deleteWrite(int id);
}
