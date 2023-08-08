package com.example.myworld.demo.controller;

import com.example.myworld.demo.model.State;
import com.example.myworld.demo.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/state")
@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
public class StateController {
    @Autowired
    StateService stateService;

    @GetMapping
    public List<State> getAllStates(){
        return stateService.getallStates();
    }
}
