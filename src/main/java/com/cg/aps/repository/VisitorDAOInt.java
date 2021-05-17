package com.cg.aps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.VisitorEntity;

@Repository
public interface VisitorDAOInt extends JpaRepository<VisitorEntity, String> {

//	public long add(VisitorEntity bean);
	
//	public void update(VisitorEntity bean);
	
//	public void delete(VisitorEntity bean);
	
	public List<VisitorEntity> findByName(String name);
	
//	public VisitorEntity findById(long id);
	
//	public List<VisitorEntity> search(VisitorEntity bean, long pageNo, int pageSize);
	
//	public List<VisitorEntity> search(VisitorEntity bean);
	
	
}
