package com.fabelio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabelio.dao.LinkimageDao;
import com.fabelio.entity.LinkImage;
import com.fabelio.exception.ErrorException;

@Service("productService")
public class LinkimageService {
	
	@Autowired
	private LinkimageDao linkDao;
	
	public void insert(LinkImage link) throws ErrorException {
		linkDao.save(link);
	}
	
	public void update(LinkImage link) throws ErrorException{
		linkDao.save(link);
	}
	
	public void delete(LinkImage link) throws ErrorException{
		linkDao.delete(link);
	}
}
