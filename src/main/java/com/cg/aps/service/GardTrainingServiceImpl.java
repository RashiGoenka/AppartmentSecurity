package com.cg.aps.service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.GardSalaryEntity;
import com.cg.aps.entities.GardsTranningEntity;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.GardTraningDAO;

@Service
@Transactional
public class GardTrainingServiceImpl implements GardTraningServiceInt {

	@Autowired
	GardTraningDAO dao;

	@Override
	public GardsTranningEntity add(GardsTranningEntity bean) {
		// TODO Auto-generated method stub
		return dao.save(bean);
	}

	@Override
	public GardsTranningEntity update(GardsTranningEntity bean) {
		// TODO Auto-generated method stub
		return dao.save(bean);
	}

	@Override
	public void delete(long userid) {
		// TODO Auto-generated method stub
		dao.deleteById(userid);
	}

	@Override
	public List<GardsTranningEntity> findByName(String name)  throws RecordNotFoundException {
		List<GardsTranningEntity> list= dao.findByName(name);
		if(list.isEmpty())
			throw new RecordNotFoundException();
		return list;
	}
@Override
	public List<GardsTranningEntity> search()throws RecordNotFoundException{
	List<GardsTranningEntity> list= dao.findAll();
	if(list.isEmpty())
		throw new RecordNotFoundException();
	return list; 
	}



}
