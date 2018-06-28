package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_Resturant")
public class Resturant implements Serializable
{
	@Id
	@GeneratedValue
	@Column(name="resturant_id")
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="city")
	private String city;
	@Column(name="address")
	private String address;
	@Column(name="website")
	private String website;
	@Column(name="contact")
	private String contact;
	@Column(name="like_count")
	private Integer likecount;
	@Column(name="description")
	private String description;
	public Resturant() {}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String getAddress() {
		return address;
	}
	public String getWebsite() {
		return website;
	}
	public String getContact() {
		return contact;
	}
	public Integer getLikecount() {
		return likecount;
	}
	public String getDescription() {
		return description;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void setLikecount(Integer likecount) {
		this.likecount = likecount;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
