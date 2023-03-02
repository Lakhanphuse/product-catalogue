package com.lakhan.product_catalogue.service;

import com.lakhan.product_catalogue.dto.ChargesDto;
import com.lakhan.product_catalogue.dto.ProductCategoryDto;
import com.lakhan.product_catalogue.model.Category;
import com.lakhan.product_catalogue.model.Product;
import com.lakhan.product_catalogue.repository.CategoryRepository;
import com.lakhan.product_catalogue.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;


    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<ProductCategoryDto> getProducts() {
        List<Product> productList = productRepository.findAll();

        List<ProductCategoryDto> productCategoryDtoList = new ArrayList<>();

        for(Product p: productList){
            ProductCategoryDto productCategoryDto = new ProductCategoryDto();

            productCategoryDto.setProductId(p.getProductId());
            productCategoryDto.setProductCategory(p.getProductCategory());
            productCategoryDto.setProductName(p.getProductName());
            productCategoryDto.setProductType(p.getProductType());
            productCategoryDto.setProductPrice(p.getProductPrice());

            Category category = categoryRepository.findByProductCategory(p.getProductCategory());

            ChargesDto chargesDto = new ChargesDto();
            chargesDto.setGst(category.getGst());
            chargesDto.setDeliveryCharges(category.getDeliveryCharge());

            productCategoryDto.setCharges(chargesDto);
            productCategoryDto.setDiscount(category.getDiscount());

            double basePrice  = p.getProductPrice();
            double gst  = category.getGst();
            double deliveryCharge = category.getDeliveryCharge();
            double finalPrice = basePrice + (basePrice*gst)/100 + deliveryCharge;

            productCategoryDto.setFinalPrice(finalPrice);


            productCategoryDtoList.add(productCategoryDto);
        }

        return  productCategoryDtoList;
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(int productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public Product updateProduct(Product product, int productId) {
        Product p = productRepository.findById(productId).get();
        p.setProductCategory(product.getProductCategory());
        p.setProductName(product.getProductName());
        p.setProductType(product.getProductType());
        p.setProductPrice(product.getProductPrice());
        productRepository.save(p);

        return p;
    }
}
