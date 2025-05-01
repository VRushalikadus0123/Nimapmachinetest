package com.example.demo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ProductRepository;
import com.example.demo.Service.ProductService;
import com.example.demo.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        Optional<Product> productOpt = productRepository.findById(id);
        if (productOpt.isPresent()) {
            return productOpt.get();
        } else {
            return null;
        }
    }

    @Override
    public String updateProduct(Long id, Product product) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Product p = optionalProduct.get();
            p.setName(product.getName());
            p.setColor(product.getColor());
            p.setCategory(product.getCategory());
            p.setPrice(product.getPrice());
            p.setStockQuantity(product.getStockQuantity());
            productRepository.save(p);
            return "Product updated successfully: " + id;
        } else {
            return "Product not found with id: " + id;
        }
    }

    @Override
    public String deleteProductById(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return "Product deleted successfully: " + id;
        } else {
            return "Product not found with id: " + id;
        }
    }

@Override
public Page<Product> getPaginatedProducts(Pageable pageable) {
    return productRepository.findAll(pageable);
}
}

