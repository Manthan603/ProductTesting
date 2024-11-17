package com.test.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sample.entity.ProductEntity;
import com.test.sample.repository.ProductRepository;

@Service
public class ProductService 
{
	@Autowired
	private ProductRepository productRepository;
	
	public ProductEntity getProductByName(String name)
	{
		ProductEntity productEntity = productRepository.findByName(name);
		productEntity.setPrice(123.0);
		productRepository.save(productEntity);
		productEntity.setPrice(456.0);
		productRepository.save(productEntity);
		productEntity.setPrice(678.0);
		productRepository.save(productEntity);
		productEntity.setPrice(890.0);
		productRepository.save(productEntity);
		return productEntity;
	}
	
	public void saveProductData()
	{
		ProductEntity productEntity = new ProductEntity();
		productEntity.setId(2);
		productEntity.setName("Fan");
		productEntity.setPrice(123.123);
		
		setDeafultValues(productEntity);
		productRepository.save(productEntity);
	}
	
	public void setDeafultValues(ProductEntity productEntity)
	{
		productEntity.setId(2);
		productEntity.setName("Fan");
		productEntity.setPrice(123.123);
		setDeafultValues1(productEntity);
	}
	
	public void setDeafultValues1(ProductEntity productEntity)
	{
		productEntity.setId(2);
		productEntity.setName("Fan");
		productEntity.setPrice(123.123);
		setDeafultValues1(productEntity);
	}
}
