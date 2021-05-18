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

import com.cg.aps.entities.GardShiftEntity;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.service.GardShiftServiceInt;


@RestController
@RequestMapping("/guardShift")
public class GuardShiftController 
{
	@Autowired
	GardShiftServiceInt service;
	
	
	@PostMapping("/addGuard")
	public void addGuardShift(@RequestBody GardShiftEntity guard)
	{
		service.add(guard);
	}
	@PutMapping("/updateGuard")
	public void uupdateGuardTraining(@RequestBody GardShiftEntity guard)
	{
		service.update(guard);
	
	}
	@DeleteMapping("/deleteGuard/{id}")
	public void deleteGuardTraining( @PathVariable("id") long id)
	{
		service.delete(id);
	}

	@GetMapping("/getAll")
	List<GardShiftEntity> searchGuards() throws RecordNotFoundException
	{
		return service.search();
	}
	
	
	}