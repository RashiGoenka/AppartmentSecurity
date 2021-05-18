package com.cg.aps.entities;

import java.util.Date;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GUARD_SHIFT")

public class GardShiftEntity {

  @Id
	private long userid;
	private String name;
	private String time;
	private Date date1;
	
	public long getUserid() {
		return userid;
	}

	public GardShiftEntity(long userid, String name, String time, Date date1) {
		super();
		this.userid = userid;
		this.name = name;
		this.time = time;
		this.date1 = date1;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Date getDate() {
		return date1;
	}

	public void setDate(Date date1) {
		this.date1 = date1;
	}
	public GardShiftEntity()
	{
		
	}


}
