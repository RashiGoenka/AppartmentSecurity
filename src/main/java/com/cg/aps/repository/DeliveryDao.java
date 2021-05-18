package com.cg.aps.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.DeliveryEntity;

/*
 * @author Mehar Asad
 * 
 */

@Repository
public interface DeliveryDao extends JpaRepository<DeliveryEntity, String> {




	
}
