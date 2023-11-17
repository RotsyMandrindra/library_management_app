package com.td_java_jdbc.td1_java_jdbc.repository;

import com.td_java_jdbc.td1_java_jdbc.model.Author;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AuthorRepositoryClass implements AuthorRepository{
    private JdbcTemplate jdbcTemplate;
    public AuthorRepositoryClass(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Author> getAllAuthor() {
        String sql = "SELECT * FROM author";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Author.class));
    }

    @Override
    public List<Author> getAuthorById(int id) {
        String sql = "SELECT * FROM author WHERE id_author=?";
        return jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Author.class));
    }

    @Override
    public List<Author> addAuthors(Author author) {
        String sql = "INSERT INTO author (author_name, sex) VALUES (?, ?)";
        jdbcTemplate.update(sql, author.getAuthor_name(), author.getSex());
        return getAllAuthor();
    }

    @Override
    public List<Author> updateAuthor(Author author) {
        String sql = "UPDATE author SET author_name=?, sex=? WHERE id_author=?";
        jdbcTemplate.update(
                sql,
                author.getAuthor_name(),
                author.getSex(),
                author.getId_author()
        );
        return getAllAuthor();
    }

    @Override
    public void deleteAuthor(int id) {
        String sql = "DELETE * FROM author WHERE id_author=?";
        jdbcTemplate.update(sql, id);
    }
}
