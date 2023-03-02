package com.lakhan.product_catalogue;

import com.lakhan.product_catalogue.model.Category;
import com.lakhan.product_catalogue.model.Product;
import com.lakhan.product_catalogue.repository.CategoryRepository;
import com.lakhan.product_catalogue.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ProductCatalogueApplication implements CommandLineRunner {

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		addCategory();
		addProducts();

	}


	private  void addProducts(){
		Product p1  = new Product();
		p1.setProductCategory("Electronics");
		p1.setProductType("Laptop");
		p1.setProductName("Lenovo Yoga");
		p1.setProductPrice(45000);

		Product p2  = new Product();
		p2.setProductCategory("Home Appliances");
		p2.setProductType("Washing Machine");
		p2.setProductName("LG Washing Machine");
		p2.setProductPrice(25000);

		Product p3  = new Product();
		p3.setProductCategory("Clothing");
		p3.setProductType("T-Shirt");
		p3.setProductName("Us POLLO ASSN");
		p3.setProductPrice(1200);


		Product p4  = new Product();
		p4.setProductCategory("Furniture");
		p4.setProductType("Sofa Set");
		p4.setProductName("Neelkamal Been Bag");
		p4.setProductPrice(350);

		List<Product> productList  = Arrays.asList(p1,p2,p3,p4);

		productRepository.saveAll(productList);


	}
	private  void addCategory(){
		Category c1  = new Category();
		c1.setProductCategory("Electronics");
		c1.setDiscount(15);
		c1.setGst(18);
		c1.setDeliveryCharge(350);

		Category c2  = new Category();
		c2.setProductCategory("Home Appliances");
		c2.setDiscount(22);
		c2.setGst(24);
		c2.setDeliveryCharge(800);


		Category c3  = new Category();
		c3.setProductCategory("Clothing");
		c3.setDiscount(40);
		c3.setGst(12);
		c3.setDeliveryCharge(0);


		Category c4  = new Category();
		c4.setProductCategory("Furniture");
		c4.setDiscount(10);
		c4.setGst(18);
		c4.setDeliveryCharge(300);

		List<Category> categoryList  = Arrays.asList(c1,c2,c3,c4);

		categoryRepository.saveAll(categoryList);


	}
}
