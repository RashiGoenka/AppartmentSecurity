package com.cg.aps.repository;
/**


* @author NAME:IndranilJana

 
*

 
*/
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cg.aps.entities.FlatRentEntity;


@Repository
public interface FlatRentDAOInt extends JpaRepository<FlatRentEntity,String> {



	 List<FlatRentEntity> findByRenterName(String name);
	 
	
	
}
