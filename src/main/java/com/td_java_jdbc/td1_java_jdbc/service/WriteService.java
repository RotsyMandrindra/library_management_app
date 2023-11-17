package com.td_java_jdbc.td1_java_jdbc.service;

import com.td_java_jdbc.td1_java_jdbc.model.Write;
import com.td_java_jdbc.td1_java_jdbc.repository.WriteRepository;

import java.util.List;

public class WriteService implements WriteServiceInterface{
    private WriteRepository writeRepository;
    public WriteService(WriteRepository writeRepository){
        this.writeRepository = writeRepository;
    }
    @Override
    public List<Write> getAllWrites() {
        return writeRepository.getAllWrite();
    }

    @Override
    public List<Write> getWriteById(int id) {
        return writeRepository.getAllWriteById(id);
    }

    @Override
    public List<Write> addWrite(Write write) {
        writeRepository.addWrite(write);
        return writeRepository.getAllWrite();
    }

    @Override
    public List<Write> updateVisitor(Write write) {
        writeRepository.updateWrite(write);
        return writeRepository.getAllWrite();
    }

    @Override
    public void deleteWrite(int id) {
        writeRepository.deleteWrite(id);
    }
}
