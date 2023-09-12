package com.dev.security.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserLogin {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
