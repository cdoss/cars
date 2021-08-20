package com.cdoss.cars.carsserver.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cdoss.cars.carsserver.persistence.make.Make;

@Entity
@Table(name = "model")
public class Model {
	
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne()
	@JoinColumn(name = "make_id")
	private Make make;
	
	@Column(name = "name")
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Make getMake() {
		return make;
	}

	public void setMake(Make make) {
		this.make = make;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
