package kz.springeshop.repositories;

import kz.springeshop.domain.Category;
import kz.springeshop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    boolean existsCategoryByProducts (Product product);
    List<Product> findAllByTitle (String title);
}
