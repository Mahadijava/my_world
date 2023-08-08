package com.example.myworld.demo.controller;

import com.example.myworld.demo.model.City;
import com.example.myworld.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
public class CityController {
    @Autowired
    CityService cityService;

    @GetMapping
    List<City> getAllcities(){
        return cityService.getallCities();
    }
}
