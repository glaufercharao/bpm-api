package com.senior.bpmapi.repository;

import com.senior.bpmapi.entity.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p from Product p WHERE p.status = 2 ORDER BY p.name")
    public List<Product> getProductAnalyze();
}
