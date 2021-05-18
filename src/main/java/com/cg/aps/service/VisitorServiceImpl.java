package com.cg.aps.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.VisitorDAOInt;
/*
 * @author: Ashutosh Ojha
 * 
 */
@Service
@Transactional
public class VisitorServiceImpl implements VisitorServiceInt
{
	@Autowired
	VisitorDAOInt dao;

	@Override
	public VisitorEntity add(VisitorEntity bean) {
		
		System.out.println("Visitor added");
		return dao.save(bean);
	}

	@Override
	public VisitorEntity  update(VisitorEntity bean) {
		return dao.save(bean);
	}

	@Override
	public void delete(VisitorEntity bean) {
		dao.deleteById(bean.getFlatNo());
	}

	@Override
	public List<VisitorEntity> findByName(String name) throws RecordNotFoundException
	{
		List<VisitorEntity> list= dao.findByName(name);
		if(list.isEmpty())
		{
			throw new RecordNotFoundException();
			
		}
		
	return list;
		
	}

	

	@Override
	public List<VisitorEntity> search() throws RecordNotFoundException
	{
		List<VisitorEntity> list= dao.findAll();
		if(list.isEmpty())
		{
			throw new RecordNotFoundException();
			
		}
		return list;
	}

}
