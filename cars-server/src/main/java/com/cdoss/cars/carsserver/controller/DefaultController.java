package com.cdoss.cars.carsserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

	@GetMapping("/hello-world")
	public ResponseEntity<String> helloWorld() {
		return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
	}
}
