package com.ecomerce.ecomerce.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@CrossOrigin
@RequestMapping(value = "/city")
public class CityController {
    

   @GetMapping(value="/city")
	public ResponseEntity getCities() {

		return new ResponseEntity<>("Cities", HttpStatus.OK);
	}
	

	@GetMapping(value="/state/{state}")
	public ResponseEntity getCitiesByState(@PathVariable String state) {

		return new ResponseEntity<>("State", HttpStatus.OK);

	}

	@GetMapping(value="{cityId}")
	public ResponseEntity getCityById(@PathVariable Long cityId) {
		return new ResponseEntity<>("Cit by id", HttpStatus.OK);
	}
    
}
