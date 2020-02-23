package com.fabelio.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.fabelio.entity.LinkImage;;

@Repository
public class LinkimageDao extends CommonDao {
	
	@Transactional
	public void save(LinkImage linkImg) {
		super.entityManager.merge(linkImg);
	}
	
	public void delete(LinkImage linkImg) {
		super.entityManager.remove(linkImg);
	}
}
