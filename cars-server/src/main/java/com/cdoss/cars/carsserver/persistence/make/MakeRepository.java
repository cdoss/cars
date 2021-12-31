package com.cdoss.cars.carsserver.persistence.make;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakeRepository extends JpaRepository<Make, Integer> {
	public Make findByName(String name);
}
