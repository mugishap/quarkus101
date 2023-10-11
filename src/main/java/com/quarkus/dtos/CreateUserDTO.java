package com.quarkus.dtos;

import lombok.Data;

@Data
public class CreateUserDTO {

    private String names;
    private String email;
    private String telephone;
    private String password;

}
