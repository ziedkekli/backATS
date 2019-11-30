package com.example.ats.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ats.entity.Product;

@Repository
public interface productRepository extends JpaRepository<Product,Long>{

}
