package com.td_java_jdbc.td1_java_jdbc.service;

import com.td_java_jdbc.td1_java_jdbc.model.Book;
import com.td_java_jdbc.td1_java_jdbc.model.Borrow_or_return;
import com.td_java_jdbc.td1_java_jdbc.repository.Borrow_or_returnRepository;

import java.util.List;

public class Borrow_or_returnService implements Borrow_or_returnServiceInterface{
    private Borrow_or_returnRepository borrowOrReturnRepository;
    public Borrow_or_returnService(Borrow_or_returnRepository borrowOrReturnRepository){
        this.borrowOrReturnRepository = borrowOrReturnRepository;
    }

    @Override
    public List<Borrow_or_return> getAllBorrowOrReturns() {
        return borrowOrReturnRepository.getAllBorrow_or_return();
    }

    @Override
    public List<Borrow_or_return> getBorrowOrReturnById(int id) {
        return borrowOrReturnRepository.getBorrow_or_returnById(id);
    }

    @Override
    public List<Borrow_or_return> addBorrowOrReturn(Borrow_or_return borrowOrReturn) {
        borrowOrReturnRepository.addBorrow_or_return(borrowOrReturn);
        return borrowOrReturnRepository.getAllBorrow_or_return();
    }

    @Override
    public List<Borrow_or_return> updateBorrowOrReturn(Borrow_or_return borrowOrReturn) {
        borrowOrReturnRepository.updateBorrow_or_return(borrowOrReturn);
        return borrowOrReturnRepository.getAllBorrow_or_return();
    }

    @Override
    public void deleteBorrowOrReturn(int id) {
        borrowOrReturnRepository.deleteBorrow_or_return(id);
    }
}
