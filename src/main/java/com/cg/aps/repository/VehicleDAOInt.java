package com.cg.aps.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cg.aps.entities.VehicleEntity;
/*
 * @author: Rashi Goenka
 * 
 */

@Repository
public interface VehicleDAOInt extends JpaRepository<VehicleEntity,String>{

//	public long add(VehicleEntity bean);
//	
//	public void update(VehicleEntity bean);
//	
//	public void delete(VehicleEntity bean);

	public List<VehicleEntity> findByName(String name);
//	

//	
//	public List<VehicleEntity> search(VehicleEntity bean);
	
	
}
