
package com.cg.aps.service;

import java.util.List;

import com.cg.aps.entities.DeliveryEntity;
import com.cg.aps.exceptions.RecordNotFoundException;
import com.cg.aps.repository.DeliveryDao;

import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/*
 * @author Mehar Asad
 * 
 */

@Service
@Transactional
public class DeliveryServiceImpl implements DeliveryService {

	@Autowired
	DeliveryDao dao;

	@Override
	public DeliveryEntity add(DeliveryEntity bean) {
		
		return dao.save(bean);
	}

	@Override
	public DeliveryEntity update(DeliveryEntity bean) {
		// TODO Auto-generated method stub
		return dao.save(bean);
	}

	@Override
	public void delete(DeliveryEntity bean) {
		
		dao.deleteById(bean.getOwnerName());
	}


	@Override
	public List<DeliveryEntity> search() throws RecordNotFoundException {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
