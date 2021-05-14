package com.cg.aps.service;
/**


* @author NAME:IndranilJana

 
*

 
*/
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.aps.entities.FlatRentEntity;


@Service
public interface FlatRentServiceInt {

	public FlatRentEntity add(FlatRentEntity bean);
	
	public FlatRentEntity update(FlatRentEntity bean);
	
	public String delete(String id);
	

	public List<FlatRentEntity> search();
	
	
}
