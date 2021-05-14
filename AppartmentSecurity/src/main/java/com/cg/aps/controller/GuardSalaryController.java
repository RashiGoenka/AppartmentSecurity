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

import com.cg.aps.entities.GardSalaryEntity;
import com.cg.aps.service.GardSalaryServiceInt;


@RestController

@RequestMapping("/guardSalary")
public class GuardSalaryController {
	@Autowired
	GardSalaryServiceInt service;
	
	@PostMapping("/addGuard")
	public void addGuardSalary(@RequestBody GardSalaryEntity guard)
	{
		service.add(guard);
	}
	
	@PutMapping("/updateGuard")
	public void updateGuardSalary(@RequestBody GardSalaryEntity guard)
	{
		service.update(guard);
	}
	@DeleteMapping("/deleteGuard")
	public void deleteGuardSalary(@RequestBody GardSalaryEntity guard)
	{
		service.delete(guard);
	}

	
	@GetMapping("/getAll")
	List<GardSalaryEntity> searchGuards()
	{
		return service.search();
		}
}