package com.fabelio.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.fabelio.entity.PriceHistory;

@Repository
public class PricehistoryDao extends CommonDao {
	
	@Transactional
	public void save(PriceHistory price) {
		super.entityManager.merge(price);
	}
	
	public void delete(PriceHistory price) {
		super.entityManager.remove(price);
	}
}
