package com.cg.aps.service;
/**


* @author NAME:IndranilJana

 
*

 
*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.FlatEntity;
import com.cg.aps.exceptions.RecordNotFoundException;
import com.cg.aps.repository.FlatDAOInt;
@Service
public class FlatServiceImpl implements FlatServiceInt {
	
	@Autowired
	FlatDAOInt dao;
	@Override
	public FlatEntity add(FlatEntity bean) {
		return dao.save(bean);
	}

	@Override
	public FlatEntity update(FlatEntity bean) {
		FlatEntity fe= dao.findById(bean.getFlatNo()).orElse(null);
		fe.setFlatType(bean.getFlatType());
		fe.setFloorNo(bean.getFloorNo());
		fe.setOwnerName(bean.getOwnerName());
		return dao.save(fe);
	}

	@Override
	public void delete(String id) {
	dao.deleteById(id);
	}

	@Override
	public List<FlatEntity> findByOwnerName(String name) throws RecordNotFoundException {
		List<FlatEntity> flist=dao.findByOwnerName(name);
		if(flist.isEmpty())
		{
			throw new RecordNotFoundException();
		}
		return flist;
	}

	@Override
	public List<FlatEntity> search() throws RecordNotFoundException
	{
		List<FlatEntity> flist=dao.findAll();
		if(flist.isEmpty())
		{
			throw new RecordNotFoundException();
		}
		
		return flist;
	}


}
