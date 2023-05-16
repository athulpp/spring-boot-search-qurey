package com.example.app4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.app4.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
            "Or p.description LIKE CONCAT('%', :query, '%')")
	List<Product>searchproducts(String query);
}
