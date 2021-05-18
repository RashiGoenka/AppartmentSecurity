package com.cg.aps.entities;
/**


* @author NAME:IndranilJana

 
*

 
*/
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Flat")
public class FlatEntity  {
	
	@Id
	private String flatNo;
	private String ownerName;
	private String floorNo;
	private String flatType;
	public FlatEntity(String flatNo, String ownerName, String floorNo, String flatType) {
		super();
		this.flatNo = flatNo;
		this.ownerName = ownerName;
		this.floorNo = floorNo;
		this.flatType = flatType;
	
	}



	public FlatEntity(){
		
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
	public String getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(String floorNo) {
		this.floorNo = floorNo;
	}
	public String getFlatType() {
		return flatType;
	}
	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}
	
	

}
