package com.cg.aps.service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.GardSalaryEntity;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.GardSalaryDAOInt;

@Service
@Transactional
public class GardSalaryServiceIntImpl implements GardSalaryServiceInt {
     
	@Autowired
	GardSalaryDAOInt dao;
	
	@Override
	public GardSalaryEntity add(GardSalaryEntity bean) {
		// TODO Auto-generated method stub
		return dao.save(bean);
	}

	@Override
	public GardSalaryEntity update(GardSalaryEntity bean) {
		// TODO Auto-generated method stub
		return dao.save(bean);
	}

	@Override
	public void delete(GardSalaryEntity bean) {
		// TODO Auto-generated method stub
	  dao.deleteById(bean.getName());
	}

	@Override
	public List<GardSalaryEntity> findByName(String name) throws RecordNotFoundException {
		List<GardSalaryEntity> list= dao.findByName(name);
		if(list.isEmpty())
			throw new RecordNotFoundException();
		return list;
	}

	@Override
	public List<GardSalaryEntity> search() throws RecordNotFoundException{
		List<GardSalaryEntity> list= dao.findAll();
		if(list.isEmpty())
			throw new RecordNotFoundException();
		return list;
		
		
	}
	


}
