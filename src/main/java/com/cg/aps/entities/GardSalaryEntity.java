package com.cg.aps.entities;

import java.util.Date;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="GUARD_SALARY")

public class GardSalaryEntity {
		// TODO Auto-generated constructor stub
	@Id
     private String name;
	private long userid;
	private long amount;
	private String status;
	private Date date1;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getUserId() {
		return userid;
	}

	public void setUserId(long userid) {
		this.userid = userid;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date1;
	}

	public void setDate(Date date1) {
		this.date1 = date1;
	}

	public GardSalaryEntity(String name, long userid, long amount, String status, Date date1) {
		super();
		this.name = name;
		this.userid = userid;
		this.amount = amount;
		this.status = status;
		this.date1 = date1;
	}
	
	public GardSalaryEntity()
	{
	}

	
	}


