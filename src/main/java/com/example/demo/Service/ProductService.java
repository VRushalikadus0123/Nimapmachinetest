package com.example.demo.Service;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.entity.Product;

public interface ProductService {
	Product addProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(Long id);

    String updateProduct(Long id, Product product);

    String deleteProductById(Long id);
    Page<Product> getPaginatedProducts(Pageable pageable);


}
