package com.cg.aps.entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

/**
* @author Rashi Goenka
*            
*/

@Entity
@Table(name="Vehicle")
public class VehicleEntity  {
	
	@Id
	private String vehicleNo;
	private String name;
	private String parkingNo;
	private String arrivalTime;
	private String departureTime;
	private Date date1;
	
	private String vehicleType;
	
	public VehicleEntity() {
	
	}
	

	
	public VehicleEntity(String vehicleNo, String name, String parkingNo, String arrivalTime,
			String departureTime, Date date1, String vehicleType) {
		super();
		//this.vehicleid = vehicleid;
		this.vehicleNo = vehicleNo;
		this.name = name;
		this.parkingNo = parkingNo;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.date1 = date1;
		this.vehicleType = vehicleType;
	}




	public String getName() {
		return name;
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public String getParkingNo() {
		return parkingNo;
	}

	public void setParkingNo(String parkingNo) {
		this.parkingNo = parkingNo;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

		public Date getDate1() {
			return date1;
		}
		public void setDate1(Date date1) {
			this.date1 = date1;
		}




}
