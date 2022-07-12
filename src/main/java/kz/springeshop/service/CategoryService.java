package kz.springeshop.service;

import kz.springeshop.domain.Product;
import kz.springeshop.dto.ProductDto;

import java.util.List;

public interface CategoryService {
    void addProductToCategory(ProductDto productDto, String category);
    List<Product> getAllByCategory(String title);
}
