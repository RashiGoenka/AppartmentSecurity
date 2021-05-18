package com.cg.aps.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.aps.entities.DeliveryEntity;
import com.cg.aps.exceptions.RecordNotFoundException;

/*
 * @author Mehar Asad
 * 
 */
@Service
public interface DeliveryService {

	public DeliveryEntity add(DeliveryEntity bean);

	public DeliveryEntity update(DeliveryEntity bean);

	public void delete(DeliveryEntity bean);

	public List<DeliveryEntity> search() throws RecordNotFoundException;

}
