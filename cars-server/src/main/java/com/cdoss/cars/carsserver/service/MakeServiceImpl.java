package com.cdoss.cars.carsserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdoss.cars.carsserver.persistence.make.Make;
import com.cdoss.cars.carsserver.persistence.make.MakeRepository;

@Service
public class MakeServiceImpl implements MakeService {

	@Autowired
	private MakeRepository makeRepository;
	
	public List<Make> getAllMakes() {
		return makeRepository.findAll();
	}
}
