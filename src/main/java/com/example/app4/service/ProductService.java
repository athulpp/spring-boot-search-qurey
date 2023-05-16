package com.example.app4.service;

import java.util.List;

import com.example.app4.entity.Product;

public interface ProductService {
	List<Product>searchproducts(String query);

	Product createProduct(Product product);


}
