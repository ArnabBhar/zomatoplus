package com.thinkxfactor.zomatoplus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Items")
public class Items {
	@Id
	@GeneratedValue
	@Column(name="item_id")
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private Double price;
	@Column(name="quantity")
	private int quantity;
	@Column(name="resturant_id")
	private String resturantId;
	@Column(name="description")
	private String description;
	
	public Items() {}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getResturantId() {
		return resturantId;
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

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setResturantId(String resturantId) {
		this.resturantId = resturantId;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
