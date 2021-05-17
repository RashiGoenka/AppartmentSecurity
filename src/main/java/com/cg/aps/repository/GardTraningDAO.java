package com.cg.aps.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.aps.entities.GardsTranningEntity;

@Repository

public interface  GardTraningDAO extends JpaRepository<GardsTranningEntity,Long> {

	//public long add(GardsTranningEntity bean);
	
	//public void update(GardsTranningEntity bean);
	
	//public void delete(GardsTranningEntity bean);
	
	//public GardsTranningEntity findByName(String name);
	
	//public List<GardsTranningEntity> search(GardsTranningEntity bean);
	List<GardsTranningEntity> findByName(String name);
	
}
