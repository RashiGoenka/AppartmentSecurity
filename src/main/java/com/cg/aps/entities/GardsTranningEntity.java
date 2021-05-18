package com.cg.aps.entities;

import java.util.Date;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="GUARD_TRAINING")


public class GardsTranningEntity {
	
	
@Id
	private long userid;
	private String name;
	private String mobileNo;
	private String status;
	private String timeing;
	private Date date1;

	public long getUserId() {
		return userid;
	}

	public void setUserId(long userId) {
		this.userid =userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTiming() {
		return timeing;
	}

	public void setTiming(String timing) {
		this.timeing = timing;
	}

	public Date getDate() {
		return date1;
	}

	public void setDate(Date date1) {
		this.date1 = date1;
	}
	public GardsTranningEntity(long userid, String name, String mobileNo, String status, String timeing, Date date1) {
		super();
		this.userid =userid;
		this.name = name;
		this.mobileNo = mobileNo;
		this.status = status;
		this.timeing = timeing;
		this.date1 = date1;
	}
     
	public GardsTranningEntity()
	{
		
	}
	

	
	}
	


