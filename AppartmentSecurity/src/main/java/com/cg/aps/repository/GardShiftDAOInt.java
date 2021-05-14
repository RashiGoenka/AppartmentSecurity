package com.cg.aps.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.aps.entities.GardShiftEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface GardShiftDAOInt extends JpaRepository<GardShiftEntity,Long>
{

	//public long add(GardShiftEntity bean);
	
	//public void update(GardShiftEntity bean);
	
	//public void delete(GardShiftEntity bean);
	
	//public GardShiftEntity findByName(String name);
	
	//public GardShiftEntity findById(long id);
	
	//public List<GardShiftEntity> search(GardShiftEntity bean, long pageNo, int pageSize);
	
	//public List<GardShiftEntity> search(GardShiftEntity bean);
	
	//Optional<GardShiftEntity> findByShiftId(long id);
	
	
	
}
