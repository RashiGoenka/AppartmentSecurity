package com.cg.aps.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="guardshift2")
public class GuardShiftEntity {
	@Id
	private long userId;
	@Column
	private String name;
	@Column
	private String starttime;
	@Column
	private String endtime;
	@Column(name="date1",length=50)
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private LocalDate date;

	public GuardShiftEntity(long userId, String name, String starttime,String endtime,LocalDate date) {
		super();
		this.userId = userId;
		this.name = name;
		this.starttime = starttime;
		this.endtime= endtime;
		this.date = date;
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

	public GuardShiftEntity()
	{
		
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
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

}