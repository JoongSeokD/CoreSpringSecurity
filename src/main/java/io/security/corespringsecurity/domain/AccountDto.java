package io.security.corespringsecurity.domain;

import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class AccountDto {

    private String username;
    private String password;
    private String email;
    private int age;

    @Enumerated(EnumType.STRING)
    private AccountRole role;
}
