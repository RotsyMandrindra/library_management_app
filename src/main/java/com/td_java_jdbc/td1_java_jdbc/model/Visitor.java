package com.td_java_jdbc.td1_java_jdbc.model;

import lombok.*;
import org.springframework.stereotype.Service;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Visitor extends User{
    private String reference;
    public Visitor(String Id, String name, String role) {
        super(Id, name, role);
    }
}
