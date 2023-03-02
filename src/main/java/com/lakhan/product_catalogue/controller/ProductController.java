package com.lakhan.product_catalogue.controller;

import com.lakhan.product_catalogue.dto.ProductCategoryDto;
import com.lakhan.product_catalogue.model.Product;
import com.lakhan.product_catalogue.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping("/getProducts")
    public List<ProductCategoryDto> getProducts(){
        return  productService.getProducts();
    }

    @PostMapping("/products")
    public Product getProducts( @RequestBody Product product){
        Product newProduct  = productService.addProduct(product);
        return  newProduct;
    }

    @DeleteMapping("/products/{productId}")
    public String getAllProducts(@PathVariable int productId){
        productService.deleteProduct(productId);
        return  "Product deleted successfully..";
    }

    @PutMapping("/products/{productId}")
    public Product updateProduct(@RequestBody Product product,@PathVariable int productId){
        return productService.updateProduct(product,productId);
    }


}
