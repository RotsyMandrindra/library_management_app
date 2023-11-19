package com.td_java_jdbc.td1_java_jdbc.model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public abstract class User {
    private String Id;
    private String name;
    private String role;
}
