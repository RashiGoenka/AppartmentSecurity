package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.aps.entities.VehicleEntity;
import com.cg.aps.exception.RecordNotFoundException;


@Service
public interface VehicleServiceInt  {

	public VehicleEntity add(VehicleEntity bean);
	
	public VehicleEntity update(VehicleEntity bean);
	
	public void delete(VehicleEntity bean);
	
	public List<VehicleEntity> findByName(String name) throws RecordNotFoundException;
	
	public Optional<VehicleEntity> findByPk(String id);
	public List<VehicleEntity> search() throws RecordNotFoundException;
	
	
}
