package com.example.myworld.demo.service;

import com.example.myworld.demo.model.Country;
import com.example.myworld.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    public List<Country> getallCountries(){

        return countryRepository.findAll();
    }
}
