package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.aps.entities.GardsTranningEntity;
import com.cg.aps.exception.RecordNotFoundException;


@Service
public interface GardTraningServiceInt {
	
   public GardsTranningEntity add(GardsTranningEntity bean);
	
	public GardsTranningEntity update(GardsTranningEntity bean);
	
	public void delete(long userid);
	
	public List<GardsTranningEntity> findByName(String name)throws RecordNotFoundException ;
	
	public List<GardsTranningEntity> search()throws RecordNotFoundException;

	
	
}
