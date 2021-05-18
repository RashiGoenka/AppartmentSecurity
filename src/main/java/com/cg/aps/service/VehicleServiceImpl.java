package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.VehicleEntity;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.VehicleDAOInt;

/*
 * @author: Rashi Goenka
 * 
 */
@Service
@Transactional
public  class VehicleServiceImpl implements VehicleServiceInt {
	
	@Autowired
	VehicleDAOInt dao;

	@Override
	public VehicleEntity add(VehicleEntity bean) {
		
		System.out.println("Vehicle Added Successfully");
	      return dao.save(bean);
	     
	}

	@Override
	public VehicleEntity update(VehicleEntity bean) {
		return dao.save(bean);
			
		
	}

	@Override
	public void delete(VehicleEntity bean) {
		dao.deleteById(bean.getVehicleNo());
		
	}

	@Override
	public List<VehicleEntity> findByName(String name) throws RecordNotFoundException {
		List<VehicleEntity> list= dao.findByName(name);
		if(list.isEmpty())
			throw new RecordNotFoundException();
		return list;
	
	}

	@Override
	public List<VehicleEntity> search() throws RecordNotFoundException{
		List<VehicleEntity> list= dao.findAll();
		if(list.isEmpty())
			throw new RecordNotFoundException();
		return list;
	}

	@Override
	public Optional<VehicleEntity> findByPk(String id) {
		
		return dao.findById(id);
	}

}
