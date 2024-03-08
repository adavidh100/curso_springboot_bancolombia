package com.bancolombia.backend.backend.service;

import com.bancolombia.backend.backend.dto.ProductDTO;
import com.bancolombia.backend.backend.model.ProductEntity;
import org.springframework.http.ResponseEntity;

public interface IProductService {

    ResponseEntity<ProductEntity> create (ProductDTO productDTO);

    ResponseEntity getAll();

    ResponseEntity getById(long id);

    ResponseEntity update(long id, ProductDTO productDTO);

    ResponseEntity getByName(String name);

    ResponseEntity getByStock(int Stock);
}
