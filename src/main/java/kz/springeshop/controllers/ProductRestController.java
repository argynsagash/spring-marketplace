package kz.springeshop.controllers;

import kz.springeshop.dto.ProductDto;
import kz.springeshop.service.ProductService;
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
