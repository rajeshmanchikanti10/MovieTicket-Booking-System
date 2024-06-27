package org.example.dtos;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private String id;
    private String name;
    private String email;
    private String password;
}
