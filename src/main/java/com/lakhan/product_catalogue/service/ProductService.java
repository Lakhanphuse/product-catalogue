package com.lakhan.product_catalogue.service;

import com.lakhan.product_catalogue.dto.ProductCategoryDto;
import com.lakhan.product_catalogue.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getAllProducts();
    public Product addProduct(Product product);
    public void deleteProduct(int productId);
    public Product updateProduct(Product product, int productId);

    public List<ProductCategoryDto> getProducts();
}
