package com.td_java_jdbc.td1_java_jdbc.service;

import com.td_java_jdbc.td1_java_jdbc.model.Visitor;

import java.util.List;

public interface VisitorServiceInterface {
    List<Visitor> getAllVisitors();
    List<Visitor> getVisitorById(int id);
    List<Visitor> addVisitor(Visitor visitor);
    List<Visitor> updateVisitor(Visitor visitor);
    void deleteVisitor(int id);
}
