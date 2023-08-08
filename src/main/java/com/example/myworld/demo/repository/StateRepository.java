package com.example.myworld.demo.repository;

import com.example.myworld.demo.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
