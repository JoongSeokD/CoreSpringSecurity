package io.security.corespringsecurity.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Account {

    @Id @GeneratedValue
    private Long id;

    private String username;
    private String password;
    private String email;
    private int age;

    @Enumerated(EnumType.STRING)
    private AccountRole role;
}
