package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ProductRepo;
import com.example.demo.entity.Product;

@Service
public class ProductService {
@Autowired
private ProductRepo pRepo;
	public Product save(Product product) {
		return pRepo.save(product);
	}

}
