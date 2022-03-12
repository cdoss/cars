package com.cdoss.cars.carsserver.persistence.listing;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cdoss.cars.carsserver.persistence.make.Make;
import com.cdoss.cars.carsserver.persistence.model.Model;

@Entity
@Table(name = "listing")
public class Listing {

	@Id
	@GeneratedValue
	private long id;

	@ManyToOne
	@JoinColumn(name = "make_id")
	private Make make;

	@ManyToOne
	@JoinColumn(name = "model_id")
	private Model model;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "list_date")
	private LocalDateTime listDate;

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

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDateTime getListDate() {
		return listDate;
	}

	public void setListDate(LocalDateTime listDate) {
		this.listDate = listDate;
	}

}
