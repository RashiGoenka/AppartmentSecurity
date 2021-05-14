package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.aps.entities.VehicleEntity;


@Service
public interface VehicleServiceInt  {

	public void add(VehicleEntity bean);
	
	public void update(VehicleEntity bean);
	
	public void delete(VehicleEntity bean);
	
	public List<VehicleEntity> findByName(String name);
	
	public List<VehicleEntity> search();
	
	
}
