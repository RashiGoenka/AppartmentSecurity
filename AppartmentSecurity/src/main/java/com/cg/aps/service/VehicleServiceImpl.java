package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.VehicleEntity;
import com.cg.aps.repository.VehicleDAOInt;

/**
* @author Rashi Goenka
*            
*/

@Service
@Transactional
public class VehicleServiceImpl implements VehicleServiceInt {
	
	@Autowired
	VehicleDAOInt dao;

	@Override
	public void add(VehicleEntity bean) {
		
	     dao.save(bean);
	     System.out.println("Vehicle Added Successfully");
	}

	@Override
	public void update(VehicleEntity bean) {
		if(dao.existsById(bean.getVehicleNo()))
		{
			dao.save(bean);
			System.out.println("Updated Successfully");
		}
		else
			System.out.println("Invalid details");
			
		
	}

	@Override
	public void delete(VehicleEntity bean) {
		if(dao.existsById(bean.getVehicleNo()))
		{
			dao.deleteById(bean.getVehicleNo());
			System.out.println("Deleted Successfully");
		}
		else
			System.out.println("Invalid details");
		
	}

	@Override
	public List<VehicleEntity> findByName(String name) {
			return dao.findByName(name);
	
	}
	@Override
	public Optional<VehicleEntity> findByPk(String id) {
		
		return dao.findById(id);
	}

	@Override
	public List<VehicleEntity> search() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
