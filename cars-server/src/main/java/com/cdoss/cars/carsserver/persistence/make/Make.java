package com.cdoss.cars.carsserver.persistence.make;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cdoss.cars.carsserver.persistence.listing.Listing;
import com.cdoss.cars.carsserver.persistence.model.Model;

@Entity
@Table(name = "make")
public class Make {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "make", fetch = FetchType.LAZY)
	private List<Model> models;

	@OneToMany(mappedBy = "make", fetch = FetchType.LAZY)
	private List<Listing> listings;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Model> getModels() {
		return models;
	}

	public void setModels(List<Model> models) {
		this.models = models;
	}

	public List<Listing> getListings() {
		return listings;
	}

	public void setListings(List<Listing> listings) {
		this.listings = listings;
	}

}
