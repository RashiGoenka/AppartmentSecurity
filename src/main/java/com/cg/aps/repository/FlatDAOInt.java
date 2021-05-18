package com.cg.aps.repository;
/**


* @author NAME:IndranilJana

 
*

 
*/
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.FlatEntity;



@Repository
public interface FlatDAOInt extends JpaRepository<FlatEntity,String>{
	List<FlatEntity> findByOwnerName(String name);


}
