package com.example.ats.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ats.entity.Product;
import com.example.ats.repository.productRepository;

@Service
@Transactional
public class ProductImplementServ implements ProductService{
	
	@Autowired
	productRepository productRepo;
	
	@Override
	public List<Product> getAllProduts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Product getById(Long id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).get();
	}

}
