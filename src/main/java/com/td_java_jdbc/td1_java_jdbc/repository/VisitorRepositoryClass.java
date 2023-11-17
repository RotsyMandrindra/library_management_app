package com.td_java_jdbc.td1_java_jdbc.repository;

import com.td_java_jdbc.td1_java_jdbc.model.Visitor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class VisitorRepositoryClass implements VisitorRepository{
    private JdbcTemplate jdbcTemplate;
    public VisitorRepositoryClass(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Visitor> getAllVisitor() {
        String sql = "SELECT * FROM visitor";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Visitor.class));
    }

    @Override
    public List<Visitor> getALlVisitorById(int id) {
        String sql = "SELECT * FROM visitor WHERE id_visitor=?";
        return jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Visitor.class));
    }

    @Override
    public List<Visitor> addVisitor(Visitor visitor) {
        String sql = "INSERT INTO visitor (visitor_name, reference) VALUES (?, ?)";
        jdbcTemplate.update(sql, visitor.getVisitor_name(), visitor.getReference());
        return getAllVisitor();
    }

    @Override
    public List<Visitor> updateVisitor(Visitor visitor) {
        String sql = "UPDATE visitor SET visitor_name=? , reference=? WHERE id_visitor=?";
        jdbcTemplate.update(
                sql,
                visitor.getVisitor_name(),
                visitor.getReference(),
                visitor.getId_visitor()
        );
        return getAllVisitor();
    }

    @Override
    public void deleteVisitor(int id) {
        String sql = "DELETE FROM visitor WHERE id_visitor=?";
        jdbcTemplate.update(sql, id);
    }
}
