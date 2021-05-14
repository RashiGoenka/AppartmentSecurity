package com.cg.aps.service;
/**


* @author NAME:IndranilJana

 
*

 
*/
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.aps.entities.FlatEntity;


@Service
public interface FlatServiceInt {

	public FlatEntity add(FlatEntity bean);
	
	public FlatEntity update(FlatEntity bean);
	
	public void delete(String id);
	
	public List<FlatEntity> findByOwnerName(String name);
	
	public List<FlatEntity> search();

	
	
	
}
