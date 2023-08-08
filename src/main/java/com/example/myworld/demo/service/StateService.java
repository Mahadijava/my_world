package com.example.myworld.demo.service;

import com.example.myworld.demo.model.State;
import com.example.myworld.demo.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {
    @Autowired
    StateRepository stateRepository;

    public List<State> getallStates(){

        return stateRepository.findAll();
    }
}
