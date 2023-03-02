package com.lakhan.product_catalogue.controller;

import com.lakhan.product_catalogue.model.Category;
import com.lakhan.product_catalogue.model.Product;
import com.lakhan.product_catalogue.service.CategoryService;
import com.lakhan.product_catalogue.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getProducts(){
        return  categoryService.getCategories();
    }
}
