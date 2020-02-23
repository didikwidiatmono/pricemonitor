package com.fabelio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabelio.dao.ProductDao;
import com.fabelio.entity.Product;
import com.fabelio.exception.ErrorException;

@Service("productService")
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public void insert(Product product) throws ErrorException {
		productDao.save(product);
	}
	
	public void update(Product product) throws ErrorException{
		productDao.save(product);
	}
	
	public void delete(Product product) throws ErrorException{
		productDao.delete(product);
	}
	
	public List<Product> findAll()  throws ErrorException {
		List<Product> product = productDao.findAll();
		return product;
	}
	
	public Product findById(String id) throws ErrorException {
		Product product = productDao.findById(id);
		return product;
	}
}
