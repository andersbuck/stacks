package com.andersbuck.app.webapp.domain.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class User {

    private Long id;
    private String name;
    private String username;
    private String email;

}