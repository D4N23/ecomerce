package com.ecomerce.ecomerce;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomerceApplication {

    public static void main(String[] args) {
        System.out.println("Checking the timezone: " + LocalDateTime.now() + " - " + new Date());
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
        System.out.println("Setting the timezone: " + TimeZone.getTimeZone(
                "America/Sao_Paulo").getID() + " - " + LocalDateTime.now() + " - " + new Date());
        SpringApplication.run(EcomerceApplication.class, args);
    }
}