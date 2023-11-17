package com.td_java_jdbc.td1_java_jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Borrow_or_return {
    private int id_borrow_or_return;
    private int id_visitor;
    private int id_book;
}
