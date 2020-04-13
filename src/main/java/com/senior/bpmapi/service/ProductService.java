package com.senior.bpmapi.service;

import com.senior.bpmapi.entity.Product;
import com.senior.bpmapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.OpAnd;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findProduct(){
        return productRepository.findAll();
    }

    public Product saveProduct(Product product){
        Product prod = productRepository.save(product);
        return prod;
    }

    public Product findOne(Long code){
        return productRepository.findById(code)
                .orElse(null);

    }

    public List<Product> findProductAnalyze() {
        List<Product> prods = productRepository.getProductAnalyze();
        return prods;
    }

}
