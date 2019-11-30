package com.example.ats.service;

import java.util.List;

import com.example.ats.entity.Product;


public interface ProductService {
	public List<Product> getAllProduts();
	public Product getById(Long id);
}
