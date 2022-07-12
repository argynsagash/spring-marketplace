package kz.springeshop.service.impl;

import kz.springeshop.domain.Bucket;
import kz.springeshop.domain.Category;
import kz.springeshop.domain.Product;
import kz.springeshop.dto.ProductDto;
import kz.springeshop.mapper.ProductMapper;
import kz.springeshop.repositories.CategoryRepository;
import kz.springeshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final ProductMapper mapper = ProductMapper.MAPPER;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    @Transactional
    public void addProductToCategory(ProductDto productDto, String category) {


        Product product = mapper.toProduct(productDto);
        System.out.println(categoryRepository.existsCategoryByProducts(product));
        if (categoryRepository.existsCategoryByProducts(product)) {

        } else {
            Category categoryNew = new Category();
//            categoryNew.setTitle(category);
//            categoryRepository.save(categoryNew);
        }


    }

    @Override
    public List<Product> getAllByCategory(String title) {
       return categoryRepository.findAllByTitle(title);
    }

    //
//    public void addProducts(Bucket bucket, List<Long> productIds) {
//        List<Product> products = bucket.getProducts();
//        List<Product> newProductsList = products == null ? new ArrayList<>() : new ArrayList<>(products);
//        newProductsList.addAll(getCollectRefProductsByIds(productIds));
//        bucket.setProducts(newProductsList);
//        bucketRepository.save(bucket);
//    }
}
