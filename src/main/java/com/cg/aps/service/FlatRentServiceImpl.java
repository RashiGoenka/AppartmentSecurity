package com.cg.aps.service;
/**


* @author NAME:IndranilJana

 
*

 
*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.FlatRentEntity;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.FlatRentDAOInt;
@Service
public class FlatRentServiceImpl implements FlatRentServiceInt {
	
	@Autowired
	FlatRentDAOInt dao;
	
	@Override
	public FlatRentEntity add(FlatRentEntity bean) {
		
	
		return  dao.save(bean);
	}

	@Override
	public FlatRentEntity update(FlatRentEntity bean) {
		
		return dao.save(bean);
	}

	@Override
	public String delete(String id) {
		dao.deleteById(id);
		return "deleted";
		
	}



	@Override
	public List<FlatRentEntity> findByname(String name) throws RecordNotFoundException {
		List<FlatRentEntity> frlist =dao.findByRenterName(name);
		if(frlist.isEmpty())
		{
			throw new RecordNotFoundException();
		}
	
		return frlist;
	}

	@Override
	public List<FlatRentEntity> search() throws RecordNotFoundException{
		List<FlatRentEntity> frlist=dao.findAll();
		if(frlist.isEmpty())
		{
			throw new RecordNotFoundException();
		}
		return frlist;
	}

}
