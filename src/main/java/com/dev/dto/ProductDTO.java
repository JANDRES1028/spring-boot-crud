package com.dev.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductDTO {
    @NotBlank
    private String name;
    @Min(0)
    private Double price;

    public ProductDTO(@NotBlank String name, @Min(0) Double price) {
        this.name = name;
        this.price = price;
    }
}
