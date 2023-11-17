package com.td_java_jdbc.td1_java_jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor

public class Visitor {
    private int id_visitor;
    private String visitor_name;
    private String reference;
}
