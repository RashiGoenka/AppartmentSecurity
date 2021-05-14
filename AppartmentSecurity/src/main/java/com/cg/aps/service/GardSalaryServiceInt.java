package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.aps.entities.GardSalaryEntity;


@Service
public interface GardSalaryServiceInt {
	public GardSalaryEntity add(GardSalaryEntity bean);

	public GardSalaryEntity update(GardSalaryEntity bean);
	public void delete(GardSalaryEntity bean);
	
	public GardSalaryEntity findByName(String name);
	public List<GardSalaryEntity> search();
	
	
}
