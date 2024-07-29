package com.ecomerce.ecomerce.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Delegate;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@CrossOrigin
@RestController
@RequestMapping(value = "/admin")
public class AdministratorConroller {
    
    @GetMapping
    public ResponseEntity getAdmin(){
        return new ResponseEntity<>("Admin", HttpStatus.OK);
    }

    @GetMapping(value = "{adminId}")
    public ResponseEntity getAdminById(){
        return new ResponseEntity<>("Admin Id", HttpStatus.OK);
    }

    @GetMapping(value = "/user/{adminId}")
    public ResponseEntity getAdminByUserId(){
        return new ResponseEntity<>("Admin by User Id", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createAdmin(){
        return new ResponseEntity<>("Create Admin", HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity updateAdministrator(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return new ResponseEntity<>("Update Admin", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity deleteAdministrator(@PathVariable String id) {
        //TODO: process PUT request
        
        return new ResponseEntity<>("Update Admin", HttpStatus.OK);
    }
}
