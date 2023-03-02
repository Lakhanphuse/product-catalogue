package com.lakhan.product_catalogue.service;

import com.lakhan.product_catalogue.model.Category;
import com.lakhan.product_catalogue.model.Product;
import com.lakhan.product_catalogue.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }


}
