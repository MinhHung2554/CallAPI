package com.example.demo.repository;

import com.example.demo.entity.ProductBrand;
import com.example.demo.entity.ProductBrandId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductBrandRepository extends JpaRepository<ProductBrand, ProductBrandId> {
}
