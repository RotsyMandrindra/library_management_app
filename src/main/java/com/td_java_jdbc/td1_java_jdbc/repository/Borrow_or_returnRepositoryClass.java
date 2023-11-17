package com.td_java_jdbc.td1_java_jdbc.repository;

import com.td_java_jdbc.td1_java_jdbc.model.Borrow_or_return;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Borrow_or_returnRepositoryClass implements Borrow_or_returnRepository {
    private JdbcTemplate jdbcTemplate;

    public Borrow_or_returnRepositoryClass(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Borrow_or_return> getAllBorrow_or_return() {
        String sql = "SELECT * FROM borrow_or_return";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Borrow_or_return.class));
    }

    @Override
    public List<Borrow_or_return> getBorrow_or_returnById(int id) {
        String sql = "SELECT * FROM borrow_or_return WHERE id_borrow_or_return=?";
        return jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Borrow_or_return.class));
    }

    @Override
    public List<Borrow_or_return> addBorrow_or_return(Borrow_or_return borrowOrReturn) {
        String sql = "INSERT INTO borrow_or_return (id_visitor, id_book) VALUES (?, ?)";
        jdbcTemplate.update(sql, borrowOrReturn.getId_visitor(), borrowOrReturn.getId_book());
        return getAllBorrow_or_return();
    }

    @Override
    public List<Borrow_or_return> updateBorrow_or_return(Borrow_or_return borrowOrReturn) {
        String sql = "UPDATE borrow_or_return SET id_visitor=?, id_book=? WHERE id_borrow_or_return=?";
        jdbcTemplate.update(
                sql,
                borrowOrReturn.getId_visitor(),
                borrowOrReturn.getId_book(),
                borrowOrReturn.getId_borrow_or_return()
        );
        return getAllBorrow_or_return();
    }

    @Override
    public void deleteBorrow_or_return(int id) {
        String sql = "DELETE FROM borrow_or_return WHERE id_borrow_or_return=?";
        jdbcTemplate.update(sql, id);
    }
}