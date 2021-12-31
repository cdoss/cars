package com.cdoss.cars.carsserver.persistence.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdoss.cars.carsserver.persistence.make.Make;

public interface ModelRepository extends JpaRepository<Model, Long> {
	public List<Model> findByMake(Make make); 
}
