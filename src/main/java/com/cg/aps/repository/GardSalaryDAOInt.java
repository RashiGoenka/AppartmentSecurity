package com.cg.aps.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.GardSalaryEntity;

@Repository

public interface GardSalaryDAOInt extends JpaRepository <GardSalaryEntity, String>{

	//public long add(GardSalaryEntity bean);
	
	//public void update(GardSalaryEntity bean);
	
	//public void delete(GardSalaryEntity bean);
	
	public List<GardSalaryEntity> findByName(String name);
	
	
}
