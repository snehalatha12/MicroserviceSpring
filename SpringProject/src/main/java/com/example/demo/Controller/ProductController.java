package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Service.ProductService;
import com.example.demo.entity.Product;

@RestController
public class ProductController {

	@Autowired
	private ProductService pService;
	
	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product product) {
		return pService.save(product);
		
	}
}
