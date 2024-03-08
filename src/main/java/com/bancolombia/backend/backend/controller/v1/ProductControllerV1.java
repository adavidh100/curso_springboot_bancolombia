package com.bancolombia.backend.backend.controller.v1;

import com.bancolombia.backend.backend.controller.v1.doc.IProductDoc;
import com.bancolombia.backend.backend.dto.ProductDTO;
import com.bancolombia.backend.backend.model.ProductEntity;
import com.bancolombia.backend.backend.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ProductControllerV1 implements IProductDoc {
    private final IProductService productService;

    @Override
    public ResponseEntity create(ProductDTO productDTO) {
        return this.productService.create(productDTO);
    }


}
