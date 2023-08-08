package com.example.myworld.demo.service;

import com.example.myworld.demo.model.City;
import com.example.myworld.demo.model.Country;
import com.example.myworld.demo.repository.CityRepository;
import com.example.myworld.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    CityRepository cityRepository;

    public List<City> getallCities(){

        return cityRepository.findAll();
    }
}
