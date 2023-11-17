package com.td_java_jdbc.td1_java_jdbc.service;

import com.td_java_jdbc.td1_java_jdbc.model.Book;
import com.td_java_jdbc.td1_java_jdbc.model.Borrow_or_return;

import java.util.List;

public interface Borrow_or_returnServiceInterface {
    List<Borrow_or_return> getAllBorrowOrReturns();
    List<Borrow_or_return> getBorrowOrReturnById(int id);
    List<Borrow_or_return> addBorrowOrReturn(Borrow_or_return borrowOrReturn);
    List<Borrow_or_return> updateBorrowOrReturn(Borrow_or_return borrowOrReturn);
    void deleteBorrowOrReturn(int id);
}
