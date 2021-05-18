package com.cg.aps.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.exception.RecordNotFoundException;
/*
 * @author: Ashutosh Ojha
 * 
 */

@Service
public interface VisitorServiceInt {

	public VisitorEntity add(VisitorEntity bean);
	
	public VisitorEntity update(VisitorEntity bean);
	
	public void delete(VisitorEntity bean);
	
	public List<VisitorEntity> findByName(String name) throws RecordNotFoundException;
	
	
	
	public List<VisitorEntity> search() throws RecordNotFoundException;
	
	
}
