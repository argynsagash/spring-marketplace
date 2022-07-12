package kz.springeshop.repositories;

import kz.springeshop.domain.Product;
import kz.springeshop.dto.ProductDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
