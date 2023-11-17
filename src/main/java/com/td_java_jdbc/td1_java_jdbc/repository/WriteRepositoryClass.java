package com.td_java_jdbc.td1_java_jdbc.repository;

import com.td_java_jdbc.td1_java_jdbc.model.Write;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class WriteRepositoryClass implements WriteRepository{
    private JdbcTemplate jdbcTemplate;
    public WriteRepositoryClass(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Write> getAllWrite() {
        String sql = "SELECT * FROM write";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Write.class));
    }

    @Override
    public List<Write> getAllWriteById(int id) {
        String sql = "SELECT * FROM write WHERE id_write=?";
        return jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Write.class));
    }

    @Override
    public List<Write> addWrite(Write write) {
        String sql = "INSERT INTO write (id_author, id_book) VALUES (?, ?)";
        jdbcTemplate.update(
                sql,
                write.getId_author(),
                write.getId_book()
        );
        return getAllWrite();
    }

    @Override
    public List<Write> updateWrite(Write write) {
        String sql = "UPDATE write SET id_author=?, id_book=? WHERE id_write=?";
        jdbcTemplate.update(
                sql,
                write.getId_author(),
                write.getId_book(),
                write.getId_write()
        );
        return getAllWrite();
    }

    @Override
    public void deleteWrite(int id) {
        String sql = "DELETE FROM write WHERE id_write=?";
        jdbcTemplate.update(sql, id);
    }
}
