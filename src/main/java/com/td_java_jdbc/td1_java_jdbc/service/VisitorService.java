package com.td_java_jdbc.td1_java_jdbc.service;

import com.td_java_jdbc.td1_java_jdbc.model.Visitor;
import com.td_java_jdbc.td1_java_jdbc.repository.VisitorRepository;

import java.util.List;

public class VisitorService implements VisitorServiceInterface{
    private VisitorRepository visitorRepository;
    public VisitorService(VisitorRepository visitorRepository){
        this.visitorRepository = visitorRepository;
    }
    @Override
    public List<Visitor> getAllVisitors() {
        return visitorRepository.getAllVisitor();
    }

    @Override
    public List<Visitor> getVisitorById(int id) {
        return visitorRepository.getALlVisitorById(id);
    }

    @Override
    public List<Visitor> addVisitor(Visitor visitor) {
        visitorRepository.addVisitor(visitor);
        return visitorRepository.getAllVisitor();
    }

    @Override
    public List<Visitor> updateVisitor(Visitor visitor) {
        visitorRepository.updateVisitor(visitor);
        return visitorRepository.getAllVisitor();
    }

    @Override
    public void deleteVisitor(int id) {
        visitorRepository.deleteVisitor(id);
    }
}
