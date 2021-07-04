package com.cg.aps.entities;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="guardtrain21")
public class GuardTrainingEntity {

	@Id
	private long userId;
	@Column(length=50)
	private String name;
	@Column
	private String mobileNo;
	@Column(name="status1",length=50)
	private String status;
	@Column
	private String starttime;
	@Column
	private String endtime;
	@Column(name="date1",length=50)
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private LocalDate date;
	

	public GuardTrainingEntity()
	{
		
	}
	
	
	public GuardTrainingEntity(long userId, String name, String mobileNo, String status, String starttime,String endtime,
			LocalDate date) {
		super();
		this.userId = userId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.status = status;
		this.starttime = starttime;
		this.endtime= endtime;
		this.date = date;
	}




	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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

	
	


	public String getStarttime() {
		return starttime;
	}


	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}


	public String getEndtime() {
		return endtime;
	}


	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "GuardTrainingEntity [userId=" + userId + ", name=" + name + ", mobileNo=" + mobileNo + ", status1="
				+ status + ", starttime=" + starttime + ", endtime=" + endtime + " date1=" + date + "]";
	}
	
	


}