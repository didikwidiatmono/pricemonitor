package com.fabelio.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.fabelio.entity.Product;

@Repository
public class ProductDao extends CommonDao {
	
	@Transactional
	public void save(Product product) {
		super.entityManager.merge(product);
	}
	
	public void delete(Product product) {
		super.entityManager.remove(product);
	}
	
	@SuppressWarnings("unchecked")
	public Product findById(String id) {
		List<Product> lstProd = super.entityManager
				.createQuery("from Product where id = :id")
				.setParameter("id", id)
				.getResultList();
		if(lstProd.size() == 0) 
			return null;
		else return (Product)lstProd.get(0);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Product> findAll() {
		List<Product> lstProd = super.entityManager
				.createQuery("from Product where isActive = :active")
				.setParameter("active", true)
				.getResultList();
		if(lstProd.size() == 0) return null;
		else return (List<Product>) lstProd;
	}
	
}
