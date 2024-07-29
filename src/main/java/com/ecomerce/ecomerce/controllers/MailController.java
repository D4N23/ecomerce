package com.ecomerce.ecomerce.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class MailController {

    @PostMapping(value = "/test-mail")
    public ResponseEntity testMail() {

        return new ResponseEntity("Teste Mail", HttpStatus.OK);
    }
}