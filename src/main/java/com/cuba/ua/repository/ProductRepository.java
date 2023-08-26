package com.cuba.ua.repository;

import com.cuba.ua.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

//    List<Product> findByProductNameContainingIgnoreCase(String query);
//
//    List<Product> findByCategory(String category);

}
