package com.dev.security.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class JwtDTO {
    private String token;

    public JwtDTO(String token) {
        this.token = token;
    }
}
