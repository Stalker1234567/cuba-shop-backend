package com.cuba.ua.controller;

import com.cuba.ua.model.Product;
import com.cuba.ua.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@PreAuthorize("hasRole('MANAGER')")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product addedProduct = productService.addProduct(product);
        return ResponseEntity.ok(addedProduct);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable Long productId) {
        return productService.getProductById(productId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long productId) {
        productService.deleteProduct(productId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{productId}")
    public ResponseEntity<Product> updateProduct(
            @PathVariable Long productId,
            @RequestBody Product updatedProduct) {

        Product product = productService.updateProduct(productId, updatedProduct);
        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

//    @GetMapping("/search")
//    public ResponseEntity<List<Product>> searchProducts(@RequestParam String query) {
//        List<Product> searchResults = productService.searchProducts(query);
//        return ResponseEntity.ok(searchResults);
//    }
//
//    @GetMapping("/category/{category}")
//    public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable String category) {
//        List<Product> products = productService.getProductsByCategory(category);
//        return ResponseEntity.ok(products);
//    }
}
