package com.td_java_jdbc.td1_java_jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Author {
    private int id_author;
    private String author_name;
    private char sex;
}
