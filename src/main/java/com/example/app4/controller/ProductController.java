package com.example.app4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.app4.entity.Product;
import com.example.app4.service.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
	
	
	private ProductService productService;
	
	public ProductController(ProductService productService) {
		
		this.productService = productService;
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<Product>>searchproducts(@RequestParam("query") String query){
		return ResponseEntity.ok(productService.searchproducts(query));
	}
	
	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}
	
}
