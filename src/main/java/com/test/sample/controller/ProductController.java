package com.test.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.sample.entity.ProductEntity;
import com.test.sample.service.ProductService;

@RestController
public class ProductController 
{
	@Autowired
	private ProductService productService;
	
	@GetMapping("/name")
	public ProductEntity getProductByName()
	{
		return productService.getProductByName("Ram");
	}
}
