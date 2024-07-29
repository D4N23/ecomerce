package com.ecomerce.ecomerce.controllers;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class NewsletterController {

    @PostMapping(value = "/newsletter")
    public ResponseEntity createNewsletter(@RequestBody String body) {
        return new ResponseEntity<>("NEwsletter", HttpStatus.OK);
    }

    @DeleteMapping(value = "/newsletter/{email}")
    public ResponseEntity deleteEmail(@PathVariable String email) {
        return new ResponseEntity<>("Email", HttpStatus.OK);
    }

    @GetMapping("/export/{status}")
    public void exportCSV(@PathVariable String status) throws IOException {
      
    }
}