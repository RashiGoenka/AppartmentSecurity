package com.cg.aps.service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.GardSalaryEntity;
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
	public GardSalaryEntity findByName(String name) {
		Optional<GardSalaryEntity> guard= dao.findById(name);
		return guard.get();
	}

	@Override
	public List<GardSalaryEntity> search() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	


}
