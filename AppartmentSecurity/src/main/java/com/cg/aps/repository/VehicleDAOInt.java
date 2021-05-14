package com.cg.aps.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cg.aps.entities.VehicleEntity;
/**
* @author Rashi Goenka
*            
*/

@Repository
public interface VehicleDAOInt extends JpaRepository<VehicleEntity,String>{



	public List<VehicleEntity> findByName(String name);

	
	
}
