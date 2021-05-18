package com.cg.aps.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * @author Mehar Asad
 * 
 */

@Entity
@Table(name = "Delivery")
public class DeliveryEntity {
	
	@Id
	private String ownerName;
	private String time1;
	private Date date1;
    private String status;

    
    
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getTime1() {
		return time1;
	}
	public void setTime1(String time1) {
		this.time1 = time1;
	}
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

	

public DeliveryEntity() {
	
	
}
public DeliveryEntity (String ownerName,String time1,Date date1, String status) {
	
	super();
	this.ownerName=ownerName;
	this.time1=time1;
	this.date1=date1;
	this.status=status;
}
}
