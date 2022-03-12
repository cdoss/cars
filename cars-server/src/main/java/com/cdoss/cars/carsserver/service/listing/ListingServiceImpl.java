package com.cdoss.cars.carsserver.service.listing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cdoss.cars.carsserver.persistence.listing.Listing;
import com.cdoss.cars.carsserver.persistence.listing.ListingRepository;

public class ListingServiceImpl implements ListingService {

	@Autowired
	private ListingRepository listingRepository;
	
	@Override
	public List<Listing> getAllListings() {
		return listingRepository.findAll();
	}

}
