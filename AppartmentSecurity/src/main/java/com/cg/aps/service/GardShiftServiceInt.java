package com.cg.aps.service;

import java.util.List;

import com.cg.aps.entities.GardShiftEntity;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public interface GardShiftServiceInt {
	
public GardShiftEntity add(GardShiftEntity bean);
	
	public GardShiftEntity update(GardShiftEntity bean);
	
	public void delete(long id);
	
	
	//public GardShiftEntity findByPk(long id);
	
	//public List<GardShiftEntity> search(GardShiftEntity bean, long pageNo, int pageSize);
	
	public List<GardShiftEntity> search();

}
	
	

