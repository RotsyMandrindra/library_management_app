package com.td_java_jdbc.td1_java_jdbc.repository;

import com.td_java_jdbc.td1_java_jdbc.model.Visitor;

import java.util.List;

public interface VisitorRepository {
    List<Visitor> getAllVisitor();
    List<Visitor> getALlVisitorById(int id);
    List<Visitor> addVisitor(Visitor visitor);
    List<Visitor> updateVisitor(Visitor visitor);
    void deleteVisitor(int id);
}
