package com.lakhan.product_catalogue.repository;

import com.lakhan.product_catalogue.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
