package com.cdoss.cars.carsserver.service.listing;

import java.util.List;

import com.cdoss.cars.carsserver.persistence.listing.Listing;

public interface ListingService {

	public List<Listing> getAllListings();
}
