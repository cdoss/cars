package com.cdoss.cars.carsserver.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdoss.cars.carsserver.make.dto.MakeDto;
import com.cdoss.cars.carsserver.persistence.make.Make;
import com.cdoss.cars.carsserver.service.MakeService;

@RestController
public class CarsController {

	@Autowired
	private MakeService makeService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/makes")
	public ResponseEntity<List<MakeDto>> getManufacturers() {
		List<Make> makes = makeService.getAllMakes();
		List<MakeDto> makeDtos = new ArrayList<>();
		for (Make make : makes) {
			MakeDto dto = convertToDto(make);
			makeDtos.add(dto);
		}
		return new ResponseEntity<List<MakeDto>>(makeDtos, HttpStatus.OK);
	}
	
	private MakeDto convertToDto(Make make) {
		return modelMapper.map(make, MakeDto.class);
	}
//	@GetMapping("/models")
//	public ResponseEntity<List<Model>> getModels() {
//		List<Model> models = modelRepository.findAll();
//		return new ResponseEntity<List<Model>>(models, HttpStatus.OK);
//	}
}
