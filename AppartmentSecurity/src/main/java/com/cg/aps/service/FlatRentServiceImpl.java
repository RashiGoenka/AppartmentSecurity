package com.cg.aps.service;
/**


* @author NAME:IndranilJana

 
*

 
*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.FlatRentEntity;
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
		FlatRentEntity fe=dao.findById(bean.getFlatNo()).orElse(null);
		fe.setAmount(bean.getAmount());
		fe.setOwnerName(bean.getOwnerName());
		fe.setType(bean.getType());
		return dao.save(fe);
	}

	@Override
	public String delete(String id) {
		dao.deleteById(id);
		return "deleted";
		
	}



	@Override
	public List<FlatRentEntity> search() {
		
		return dao.findAll();
	}

}
