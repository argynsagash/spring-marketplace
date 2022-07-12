package kz.springeshop.controllers;

import kz.springeshop.domain.Product;
import kz.springeshop.dto.ProductDto;
import kz.springeshop.service.CategoryService;
import kz.springeshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;


    @GetMapping("/{id}")
    public ProductDto getById(@PathVariable Long id) {
        return productService.getById(id);
    }

    @PostMapping
    public void addProduct(@RequestBody ProductDto dto, String category) {
        categoryService.addProductToCategory(dto, category);
        productService.addProduct(dto);
    }

    @GetMapping
    public List<ProductDto> getProducts() {
        return productService.getAll();
    }

    @GetMapping("/category")
    public List<Product> getByCategory(String title) {
        return categoryService.getAllByCategory(title);
    }

}
