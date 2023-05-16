package com.example.app4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app4.entity.Product;
import com.example.app4.repository.ProductRepository;
import com.example.app4.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductRepository productRepository;
	
	

	public ProductServiceImpl(ProductRepository productRepository) {
	
		this.productRepository = productRepository;
	}


	@Override
	public List<Product> searchproducts(String query) {
	List<Product>	products=productRepository.searchproducts(query);
	return products;
	}



	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

}
