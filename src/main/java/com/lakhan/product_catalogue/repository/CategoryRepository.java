package com.lakhan.product_catalogue.repository;

import com.lakhan.product_catalogue.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
    Category findByProductCategory(String category);
}
