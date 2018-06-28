package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_User")
public class User implements Serializable  {
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private long id;
	@Column(name="name",unique=true)
	private String name;
	@Column(name="password")
	private String password;
	@Column(name="mobile")
	private String mobile;
	@Column(name="type")
	private String type;
	@Column(name="address")
	private String address;
	@Column(name="landmark")
	private String landmark;
	@Column(name="pincode")
	private String pincode;
	
	public User() {
		
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public String getMobile() {
		return mobile;
	}
	public String getType() {
		return type;
	}
	public String getAddress() {
		return address;
	}
	public String getLandmark() {
		return landmark;
	}
	public String getPincode() {
		return pincode;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
