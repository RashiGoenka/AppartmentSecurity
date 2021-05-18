package com.cg.aps.service;
/**


* @author NAME:IndranilJana

 
*

 
*/
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.aps.entities.FlatEntity;
import com.cg.aps.exceptions.RecordNotFoundException;


@Service
public interface FlatServiceInt {

	public FlatEntity add(FlatEntity bean);
	
	public FlatEntity update(FlatEntity bean);
	
	public void delete(String id);
	
	public List<FlatEntity> findByOwnerName(String name) throws RecordNotFoundException;
	
	public List<FlatEntity> search() throws RecordNotFoundException;

	
	
	
}
