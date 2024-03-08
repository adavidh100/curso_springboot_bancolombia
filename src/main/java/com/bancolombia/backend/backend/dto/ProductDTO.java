package com.bancolombia.backend.backend.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDTO {
    @NotNull
    @Size(min = 4, message = "el nombre de producto no cumple con los limites especificados")
    private String name;

    @Min(value = 1,message = "El Stock no puede ser negativo")
    private int stock;

    @FutureOrPresent(message = "La fecha de creacion debe ser igual o mayor a la de ahora")
    private LocalDateTime createAt;
}
