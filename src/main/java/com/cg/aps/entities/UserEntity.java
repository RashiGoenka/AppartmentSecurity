package com.cg.aps.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Shrijoyee
 *
 */

@Entity
@Table(name = "user_detail")
public class UserEntity {

	@Id
	@Column(name = "roleid")
	private long roleId;

	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "loginid")
	private String loginId;
	@Column(name = "password")
	private String password;
	@Column(name = "mobileno")
	private String mobileNo;
	@Column(name = "emailid")
	private String emailId;

	public UserEntity() {

		super();

	}

	public UserEntity(long roleId, String firstName, String lastName, String loginId, String password, String mobileNo,
			String emailId) {
		super();
		this.roleId = roleId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.loginId = loginId;
		this.password = password;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	

	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
