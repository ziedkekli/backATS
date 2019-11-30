package com.example.ats.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ats.entity.Product;
import com.example.ats.service.ProductService;


@RestController
@EnableAutoConfiguration
@CrossOrigin("*")
@RequestMapping(value = "/")
public class productController {

	@Autowired
	ProductService productService;
	
	@GetMapping("products")
	public List<Product> getAllUser(){
		return productService.getAllProduts();
	}
	
	@GetMapping("product/{id}")
	public Product getById(@PathVariable Long id) {
		return productService.getById(id);
	}
}
