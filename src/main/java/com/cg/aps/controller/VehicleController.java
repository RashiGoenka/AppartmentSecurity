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
	public VehicleEntity addVehicle(@RequestBody VehicleEntity vehicle )
	{
		 return vehService.add(vehicle);
	}
	
	@PutMapping("/updateVehicle")
	public VehicleEntity updateVehicle(@RequestBody VehicleEntity vehicle )
	{
		return vehService.update(vehicle);
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
	@GetMapping("/findByVehicleNo/{id}")
	public Optional<VehicleEntity> findByPk(@PathVariable ("id") String id)
	{
		return vehService.findByPk(id);
	}
	
	
	
	@GetMapping("/getAllVehicle")
	public List<VehicleEntity> search()
	{
		return vehService.search();
	}


}
