package com.jay.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jay.springrestapi.entities.Product;
import com.jay.springrestapi.repos.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	ProductRepository repository; // injecting product repository

	@RequestMapping(value = "/products/", method = RequestMethod.GET)
	public List<Product> getProducts() {
		return repository.findAll();
	}
	@RequestMapping(value="/products/{id}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable("id")int id) {
		 return repository.findById(id).get();
	}
	//create product
	@RequestMapping(value = "/products/", method = RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return repository.save(product);
	}
	
	//update product
	@RequestMapping(value = "/products/", method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return repository.save(product);
	}
	//delete product
	@RequestMapping(value="/products/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id")int id) {
		 repository.deleteById(id);
	}
}
