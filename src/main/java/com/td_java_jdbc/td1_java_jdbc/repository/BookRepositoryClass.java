package com.td_java_jdbc.td1_java_jdbc.repository;

import com.td_java_jdbc.td1_java_jdbc.model.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BookRepositoryClass implements BookRepository{
    private final JdbcTemplate jdbcTemplate;
    public BookRepositoryClass(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Book> getAllBook() {
        String sql = "SELECT * FROM book";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
    }

    @Override
    public List<Book> getBooksById(int id) {
        String sql = "SELECT * FROM book WHERE id_book = ?";
        return jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Book.class));
    }

    @Override
    public List<Book> addBooks(Book book) {
        String sql = "INSERT INTO book (book_name, page_numbers, topics, release_date) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, book.getBook_name(), book.getPage_numbers(), book.getTopics(), book.getRelease_date());
        return getAllBook();
    }

    @Override
    public List<Book> updateBook(Book book) {
        String sql = "UPDATE book SET book_name=?, page_numbers=?, topics=?, release_date=? WHERE id_book=?";
        jdbcTemplate.update(
                sql,
                book.getBook_name(),
                book.getPage_numbers(),
                book.getTopics(),
                book.getRelease_date(),
                book.getId_book()
        );
        return getAllBook();
    }

    @Override
    public void deleteBook(int id) {
        String sql = "DELETE FROM book WHERE id_book=?";
        jdbcTemplate.update(sql, id);
    }
}
