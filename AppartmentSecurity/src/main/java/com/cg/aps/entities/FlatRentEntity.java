package com.cg.aps.entities;
/**


* @author NAME:IndranilJana

 
*

 
*/
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
@Entity
@Table(name="FlatRent")
public class FlatRentEntity  {

	@Id
	private String flatNo;
	private String ownerName;
	private String amount;
	private String type;
	

	public FlatRentEntity(String flatNo, String ownerName, String amount, String type) {
		super();
		this.flatNo = flatNo;
		this.ownerName = ownerName;
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
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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
