package com.cg.aps.service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.GardShiftEntity;
import com.cg.aps.repository.GardShiftDAOInt;



@Service
@Transactional

public class GardShiftServiceImpl implements GardShiftServiceInt

{
	@Autowired
	GardShiftDAOInt dao;
	@Override
	public GardShiftEntity add(GardShiftEntity bean) {
		// TODO Auto-generated method stub
		return dao.save(bean);
	}

	@Override
	public GardShiftEntity update(GardShiftEntity bean) {
		// TODO Auto-generated method stub
		return dao.save(bean);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	

	@Override
	public List<GardShiftEntity> search() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	
}
