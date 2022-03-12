package com.cdoss.cars.carsserver.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.cdoss.cars.carsserver.persistence.make.Make;
import com.cdoss.cars.carsserver.persistence.model.Model;

public class ListingDto {

	private Make make;
	private Model model;
	private BigDecimal price;
	private LocalDateTime listDate;

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
