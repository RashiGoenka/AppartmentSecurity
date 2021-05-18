package com.cg.aps.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import  org.junit.runner.RunWith;

import com.cg.aps.entities.GardsTranningEntity;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository. GardTraningDAO;
import com.cg.aps.service.GardTraningServiceInt ;

@RunWith(SpringRunner.class)
@SpringBootTest


public class GuardTrainingServiceTest {
	@Autowired
	GardTraningServiceInt service;
	@MockBean
	GardTraningDAO dao;
	
	
	@Test
	public void testAddGuardTraining()
	{
		
		GardsTranningEntity obj = new GardsTranningEntity(1222, "aditya","99999" ,"working","10.30",Date.valueOf(LocalDate.now()));
	    
		Mockito.when(dao.save(obj)).thenReturn(obj);
		assertEquals(obj,service.add(obj));
			}
	
	@Test 
	public void testUpdateGuardTraining()
	{
		
		GardsTranningEntity obj = new GardsTranningEntity(1222, "aditya","99999" ,"working","10.30",Date.valueOf(LocalDate.now()));
	   
	    Mockito.when(dao.save(obj)).thenReturn(obj);

	    assertEquals(obj,service.add(obj));
	    
	    obj.setName("harsh");
	    obj.setStatus("working");
	     
	     assertEquals(obj,service.update(obj));
	    }
	
	
	@Test
	public void testDeleteGuardTraining()
	{
		GardsTranningEntity obj = new GardsTranningEntity(1222, "aditya","99999" ,"working","10.30",Date.valueOf(LocalDate.now()));
	 service.delete(obj. getUserId());
	    verify(dao,times(1)).deleteById(obj. getUserId());
	}
	

	@Test
	public void testFindByName() throws RecordNotFoundException
	{
		String name="aditya";
		GardsTranningEntity obj = new GardsTranningEntity(1222, "aditya","99999" ,"working","10.30",Date.valueOf(LocalDate.now()));
		GardsTranningEntity obj1 = new GardsTranningEntity(1225, "harsh","981899","good","10.30",Date.valueOf(LocalDate.now()));
		
	 List<GardsTranningEntity> list  = new ArrayList();
	list.add(obj);
	list.add(obj1);
	
		Mockito.when(dao.findByName(name)).thenReturn(list);
		assertEquals(2,service.findByName(name).size());
		
	}
	
	@Test
	public void testSearch() throws RecordNotFoundException
	{
		GardsTranningEntity obj = new GardsTranningEntity(1222, "aditya","99999","accepted","10.30",Date.valueOf(LocalDate.now()));
		GardsTranningEntity obj1 = new GardsTranningEntity(1225, "harsh","981899","good","11.30",Date.valueOf(LocalDate.now()));
		List<GardsTranningEntity> list1  = new ArrayList();
		list1.add(obj);
		list1.add(obj1);
		
		
		Mockito.when(dao.findAll()).thenReturn(list1);
		assertEquals(2,service.search().size());
	}
	}


