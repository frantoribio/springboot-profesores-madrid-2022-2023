package dev.joseluisgs.tenistasprofesores.dto.raquetas;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * DTO para crear una raqueta
 */
@Data
public class RaquetaRequestDto {
    @NotBlank(message = "La marca no puede estar vacía")
    private final String marca;
    @NotBlank(message = "El modelo no puede estar vacío")
    @Min(value = 0, message = "El precio no puede ser negativo")
    private final String modelo;
    private final double precio;
    private final String imagen;
}
