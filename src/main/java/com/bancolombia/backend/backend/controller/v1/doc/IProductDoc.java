package com.bancolombia.backend.backend.controller.v1.doc;

import com.bancolombia.backend.backend.dto.ProductDTO;
import com.bancolombia.backend.backend.model.ProductEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@Tag(name = "Product" ,description = "API expuesta para el crud de un producto")
@RequestMapping("/api/v1/product")
public interface IProductDoc {

    @Operation(
            summary= "POST crear",
            description = "esta operacion es para crear un nuevo producto en la base de datos o sistema"
    )
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode  ="201",
                            description = "Producto Creado",
                            content = @Content( mediaType = MediaType.APPLICATION_JSON_VALUE)

                    ),
                    @ApiResponse(
                    responseCode  ="500",
                    description = "Error interno",
                    content = @Content( mediaType = MediaType.APPLICATION_JSON_VALUE)
                    )

            }
    )
    @PostMapping
    ResponseEntity create(@Valid @RequestBody ProductDTO productDTO);
}
