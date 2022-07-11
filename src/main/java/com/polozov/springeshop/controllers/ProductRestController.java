package com.polozov.springeshop.controllers;

import com.polozov.springeshop.domain.Product;
import com.polozov.springeshop.dto.ProductDto;
import com.polozov.springeshop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductRestController {

    private final ProductService productService;


    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ProductDto getById(@PathVariable Long id){
        return productService.getById(id);
    }

    @PostMapping
    public void addProduct(@RequestBody ProductDto dto){
        productService.addProduct(dto);
    }

    @GetMapping
    public List<ProductDto> getProducts () {
        return productService.getAll();
    }

}
