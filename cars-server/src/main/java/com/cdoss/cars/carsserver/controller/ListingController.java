package com.cdoss.cars.carsserver.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdoss.cars.carsserver.dto.ListingDto;
import com.cdoss.cars.carsserver.persistence.listing.Listing;
import com.cdoss.cars.carsserver.service.listing.ListingService;

@RestController
public class ListingController {

	@Autowired
	private ListingService listingService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/results")
	public ResponseEntity<List<ListingDto>> getInventory(){
		List<Listing> listingResults = listingService.getAllListings();
		List<ListingDto> resultsDto = new ArrayList<ListingDto>();
		for (Listing result : listingResults) {
			ListingDto dto = convertToDTO(result);
			resultsDto.add(dto);
		}
		
		return new ResponseEntity<List<ListingDto>>(resultsDto, HttpStatus.OK);
	}
	
	private ListingDto convertToDTO(Listing listing) {
		return modelMapper.map(listing, ListingDto.class);
	}
}
