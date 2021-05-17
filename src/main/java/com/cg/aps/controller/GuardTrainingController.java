package com.cg.aps.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.aps.entities.GardsTranningEntity;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.service.GardTraningServiceInt;



@RestController

@RequestMapping("/guard")
public class GuardTrainingController {

	@Autowired
	GardTraningServiceInt service;
	
	@PostMapping("/addGuard")
	public void addGuardTraining(@RequestBody GardsTranningEntity guard)
	{
		service.add(guard);
	}
	
	@PutMapping("/updateGuard")
	public void updateGuardTraining(@RequestBody GardsTranningEntity guard)
	{
		service.update(guard);
	}
	
	@DeleteMapping("/deleteGuard/{id}")
	public void deleteGuardTraining(@PathVariable("userid") long userid)
	{
		service.delete(userid);
	}
	
	@GetMapping("/getName/{name}")
	List<GardsTranningEntity> getByName(@PathVariable("name") String name) throws RecordNotFoundException
	{
		
		return service.findByName(name);
	}
	
	
	@GetMapping("/getAll")
	List<GardsTranningEntity> searchGuards() throws RecordNotFoundException
	{
		return service.search();
	}
	
}