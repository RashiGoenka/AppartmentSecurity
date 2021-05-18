package com.cg.aps.service;
/**


* @author NAME:IndranilJana

 
*

 
*/
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.aps.entities.FlatRentEntity;
import com.cg.aps.exception.RecordNotFoundException;


@Service
public interface FlatRentServiceInt {

	public FlatRentEntity add(FlatRentEntity bean);
	
	public FlatRentEntity update(FlatRentEntity bean);
	
	public String delete(String id);
	
	List<FlatRentEntity> findByname(String name) throws RecordNotFoundException;

	public List<FlatRentEntity> search() throws RecordNotFoundException;



	
	
}
