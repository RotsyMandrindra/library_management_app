package com.td_java_jdbc.td1_java_jdbc.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Admin extends User{
    public Admin(String Id, String name, String role) {
        super(Id, name, role);
    }
}
