package com.bancolombia.backend.backend.controller;


import com.bancolombia.backend.backend.dto.ProductDTO;
import com.bancolombia.backend.backend.model.ProductEntity;
import com.bancolombia.backend.backend.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
    private final IProductService productService;
    @PostMapping
    public ResponseEntity<?> save(@RequestBody ProductDTO productDTO){
        return this.productService.create(productDTO);
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        return this.productService.getAll();
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable long id,@RequestBody ProductDTO productDTO){
        return this.productService.update(id,productDTO);
    }

    @GetMapping("/stock")
    public ResponseEntity<?>  getByStock(@RequestParam int stock) {
        return this.productService.getByStock(stock);
    }


}
