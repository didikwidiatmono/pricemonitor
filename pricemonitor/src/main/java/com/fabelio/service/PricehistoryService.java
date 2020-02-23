package com.fabelio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabelio.dao.PricehistoryDao;
import com.fabelio.entity.PriceHistory;
import com.fabelio.exception.ErrorException;

@Service("productService")
public class PricehistoryService {
	
	@Autowired
	private PricehistoryDao pricehisDao;
	
	public void insert(PriceHistory price) throws ErrorException {
		pricehisDao.save(price);
	}
	
	public void update(PriceHistory price) throws ErrorException{
		pricehisDao.save(price);
	}
	
	public void delete(PriceHistory price) throws ErrorException{
		pricehisDao.delete(price);
	}
}
