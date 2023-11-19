package main.java.com.td_java_jdbc.td1_java_jdbc.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Book {
    private int id_book;
    private String book_name;
    private int page_numbers;
    private String topics;
    private LocalDateTime release_date;
}
