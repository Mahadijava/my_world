package com.example.myworld.demo.controller;

import com.example.myworld.demo.model.Country;
import com.example.myworld.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")

public class CountryController {
    @Autowired
    CountryService countryService;

    @GetMapping
    List<Country> getAllCountries(){
      return  countryService.getallCountries();
    }
}
