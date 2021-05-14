package com.cg.aps.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.aps.entities.VehicleEntity;
import com.cg.aps.service.VehicleServiceImpl;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Autowired
	VehicleServiceImpl vehService;
	
	@PostMapping("/addVehicle")
	public void addVehicle(@RequestBody VehicleEntity vehicle )
	{
		 vehService.add(vehicle);
	}
	
	@PutMapping("/updateVehicle")
	public void updateVehicle(@RequestBody VehicleEntity vehicle )
	{
		vehService.update(vehicle);
	}
	
	@DeleteMapping("/deleteVehicle")
	public void deleteVehicle(@RequestBody VehicleEntity vehicle)
	{
		vehService.delete(vehicle);
	}
	
	@GetMapping("/findByName/{name}")
	public List<VehicleEntity> findByName(@PathVariable ("name") String name)
	{
		return vehService.findByName(name);
	}
	
	
	
	@GetMapping("/getAllVehicle")
	public List<VehicleEntity> search()
	{
		return vehService.search();
	}


}
