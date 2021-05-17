package com.cg.aps.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="Visitor")

public class VisitorEntity {
@Id
private String flatNo;	
	private String name;
	private String ownerName;
	
	private Date date1;
	private String arrivalTime;
	private String departureTime;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public Date getDate() {
		return date1;
	}

	public void setDate(Date date) {
		this.date1 = date;
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

	
	public VisitorEntity(String name, String ownerName, String flatNo, Date date1, String arrivalTime,
			String departureTime) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.flatNo = flatNo;
		this.date1 = date1;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}
	public VisitorEntity()
	{
		
	}
	
	
}
