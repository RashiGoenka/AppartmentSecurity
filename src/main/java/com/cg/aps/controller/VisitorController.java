package com.cg.aps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.service.VisitorServiceImpl;

@RestController
@RequestMapping("/visitor")
public class VisitorController 
{
	@Autowired
	VisitorServiceImpl service;
	
	@PostMapping("/addVisitor")
	public VisitorEntity add(@RequestBody VisitorEntity bean)
	{
		return service.add(bean);
	}
	@PutMapping("/updateVisitor")
	public VisitorEntity update(@RequestBody VisitorEntity bean)
	{
		return service.update(bean);
	}
	@DeleteMapping("/deleteVisitor")
	public void delete(@RequestBody VisitorEntity bean)
	{
		service.delete(bean);
	}
	@GetMapping("/getbyname/{name}")
	public List<VisitorEntity> findByName(@PathVariable("name") String name) throws RecordNotFoundException
	{
		return service.findByName(name);
	}
		@GetMapping("/findAll")
	public List<VisitorEntity> search() throws RecordNotFoundException
	{
		return service.search();
	}
}
