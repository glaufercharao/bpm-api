package com.senior.bpmapi.resource;


import com.senior.bpmapi.entity.Product;
import com.senior.bpmapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping
    @CrossOrigin
    public ResponseEntity<?> findAllProduct() {
        List<Product> products = productService.findProduct();
        return ResponseEntity.ok().body(products);
    }

    @GetMapping("/analyze")
    @CrossOrigin
    public ResponseEntity<?> findAllProductAnalyze() {
        List<Product> products = productService.findProductAnalyze();
        return ResponseEntity.ok().body(products);
    }

    @PostMapping
    @CrossOrigin
    public ResponseEntity<?> save(@RequestBody Product product){
        Product prod = productService.saveProduct(product);
        return ResponseEntity.ok().body(prod);
    }

    @PutMapping("/update/{code}")
    @CrossOrigin
    public ResponseEntity<?> saveAnalyze(@RequestBody Product product, @PathVariable Long code){
        Product prod = productService.findOne(code);

        prod.setName(product.getName());
        prod.setQuantity(product.getQuantity());
        prod.setPrice(product.getPrice());
        prod.setDescription(product.getDescription());
        prod.setStatus(product.getStatus());
        prod.setReason(product.getReason());
        Product prodUpdated = productService.saveProduct(prod);
        return ResponseEntity.ok().body(prodUpdated);


    }

}
