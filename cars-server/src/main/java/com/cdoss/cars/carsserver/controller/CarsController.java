package com.cdoss.cars.carsserver.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cdoss.cars.carsserver.make.dto.MakeDto;
import com.cdoss.cars.carsserver.model.dto.ModelDto;
import com.cdoss.cars.carsserver.persistence.make.Make;
import com.cdoss.cars.carsserver.persistence.model.Model;
import com.cdoss.cars.carsserver.persistence.model.ModelRepository;
import com.cdoss.cars.carsserver.service.MakeService;
import com.cdoss.cars.carsserver.service.ModelService;

@RestController
public class CarsController {

	@Autowired
	private MakeService makeService;
	
	@Autowired
	private ModelService modelService;

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
	
	@GetMapping("/makes/{make}")
	public ResponseEntity<MakeDto> getManufacturer(@PathVariable("make") String makeStr) {
		Make make = makeService.getMakeByName(makeStr);
		MakeDto makeDto = convertToDto(make);
		return new ResponseEntity<MakeDto>(makeDto, HttpStatus.OK);
	}
	
	@GetMapping("/makes/{make}/models")
	public ResponseEntity<List<ModelDto>> getModelsByManufacturer(@PathVariable("make") String makeStr) {
		Make make = makeService.getMakeByName(makeStr);
		List<Model> models = modelService.getModelsByMake(make);
		List<ModelDto> modelsDto = new ArrayList<>();
		for(Model model : models) {
			ModelDto dto = convertToDto(model);
			modelsDto.add(dto);
		}
		return new ResponseEntity<List<ModelDto>>(modelsDto, HttpStatus.OK);
	}

	@GetMapping("/models")
	public ResponseEntity<List<ModelDto>> getModels() {
		List<Model> models = modelService.getAllModels();
		List<ModelDto> modelDtos = new ArrayList<>();
		for (Model model : models) {
			ModelDto dto = convertToDto(model);
			modelDtos.add(dto);
		}
		return new ResponseEntity<List<ModelDto>>(modelDtos, HttpStatus.OK);
	}

	private MakeDto convertToDto(Make make) {
		return modelMapper.map(make, MakeDto.class);
	}
	
	private ModelDto convertToDto(Model model) {
		ModelDto dto = modelMapper.map(model, ModelDto.class);
		dto.setMake(model.getMake().getName());
		return dto;
	}
}
