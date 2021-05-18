package com.cg.aps.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flat_rent")
public class FlatRentEntity  {

	@Id
	private String flatNo;
	private String renterName;
	private String amount;
	private String type;
	
	public FlatRentEntity(String flatNo, String renterName, String amount, String type) {
		super();
		this.flatNo = flatNo;
		this.renterName = renterName;
		this.amount = amount;
		this.type = type;
		
	}
	public FlatRentEntity() {
		
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getRenterName() {
		return renterName;
	}
	public void setRenterName(String renterName) {
		this.renterName = renterName;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	

}
