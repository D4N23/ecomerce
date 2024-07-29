package com.ecomerce.ecomerce.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@CrossOrigin
@RequestMapping("/address")
public class AddressController {
    

    @GetMapping
    public ResponseEntity getAddress() {
        return new ResponseEntity<>("Address", HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity getAddressByUserId(@RequestParam String param){
        return new ResponseEntity<>("User ID Address", HttpStatus.OK);
    }

    @GetMapping("/{addressId}")
    public ResponseEntity getAddressById(@RequestParam String param) {
        return new ResponseEntity<>("Address By ID", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createAddress(@RequestBody String entity) {

        
        return new ResponseEntity<>("Address Created", HttpStatus.CREATED);
    }

    @PutMapping("/{addressId}")
    public ResponseEntity editAddress(@PathVariable String id, @RequestBody String entity) {
    
        
        return new ResponseEntity<>("Address Edited", HttpStatus.OK);
    }

    @DeleteMapping("/{addressId}")
    public ResponseEntity deleteAddress(){
        return new ResponseEntity<>("Address Deleted", HttpStatus.OK);
    }
    
}
