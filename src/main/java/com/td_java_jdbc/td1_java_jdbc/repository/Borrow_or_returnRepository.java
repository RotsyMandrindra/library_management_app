package com.td_java_jdbc.td1_java_jdbc.repository;

import com.td_java_jdbc.td1_java_jdbc.model.Borrow_or_return;

import java.util.List;

public interface Borrow_or_returnRepository {
    List<Borrow_or_return> getAllBorrow_or_return();
    List<Borrow_or_return> getBorrow_or_returnById(int id);
    List<Borrow_or_return> addBorrow_or_return(Borrow_or_return borrowOrReturn);
    List<Borrow_or_return> updateBorrow_or_return(Borrow_or_return borrowOrReturn);
    void deleteBorrow_or_return(int id);
}
