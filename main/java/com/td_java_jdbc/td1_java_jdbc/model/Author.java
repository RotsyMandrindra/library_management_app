package com.td_java_jdbc.td1_java_jdbc.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Author {
    private int id_author;
    private String author_name;
    private char sex;
}
