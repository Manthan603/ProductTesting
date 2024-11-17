package com.test.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.sample.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>
{
	public ProductEntity findByName(String name);
}
