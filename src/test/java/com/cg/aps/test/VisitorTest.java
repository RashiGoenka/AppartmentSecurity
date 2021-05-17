package com.cg.aps.Test;

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

import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.VisitorDAOInt;
import com.cg.aps.service.VisitorServiceInt;



@SpringBootTest
public class VisitorTest 
{
	@MockBean
	VisitorDAOInt dao;
	
	@Autowired
	VisitorServiceInt service;
	
	//Add Visitor
	@Test
	public void testadd()
	{
		VisitorEntity obj= new VisitorEntity("112A","Sky","Ram", Date.valueOf(LocalDate.now()),"11:30","4:15");
		Mockito.when(dao.save(obj)).thenReturn(obj);
		assertEquals(obj, service.add(obj));
	}
	//Update Visitor
	@Test 
	public void testupdate()
	{
		VisitorEntity obj= new VisitorEntity("112A","Sky","Ram", Date.valueOf(LocalDate.now()),"11:30","4:15");
		Mockito.when(dao.save(obj)).thenReturn(obj);
		assertEquals(obj, service.add(obj));
		obj.setName("Rajesh");
		assertEquals(obj, service.update(obj));
	}
	//Delete Visitor
	@Test
	public void testdelete()
	{
		VisitorEntity obj= new VisitorEntity("112A","Sky","Ram", Date.valueOf(LocalDate.now()),"11:30","4:15");
		service.delete(obj);
		verify(dao, times(1)).deleteById(obj.getFlatNo());
	}
	//Find by Name
	@Test
	public void testfindbyName() throws RecordNotFoundException
	{
		String name= "Sky";
		VisitorEntity obj= new VisitorEntity("112A","Sky","Ram", Date.valueOf(LocalDate.now()),"11:30","4:15");
		VisitorEntity obj1= new VisitorEntity("105","Sky","Ram", Date.valueOf(LocalDate.now()),"11:30","4:15");
		List<VisitorEntity> list= new ArrayList(); 
		list.add(obj);
		list.add(obj1);
		Mockito.when(dao.findByName(name)).thenReturn(list);
		assertEquals(2, service.findByName(name).size());
	}
	//Search
	@Test
	public void testsearch() throws RecordNotFoundException
	{
		VisitorEntity obj= new VisitorEntity("112A","Sky","Ram", Date.valueOf(LocalDate.now()),"11:30","4:15");
		VisitorEntity obj1= new VisitorEntity("105","Sky","Ram", Date.valueOf(LocalDate.now()),"11:30","4:15");
		List<VisitorEntity> list= new ArrayList(); 
		list.add(obj);
		list.add(obj1);
		Mockito.when(dao.findAll()).thenReturn(list);
		assertEquals(2, service.search().size());
	}
}
