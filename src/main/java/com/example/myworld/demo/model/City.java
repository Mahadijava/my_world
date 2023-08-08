package com.example.myworld.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class City {
    @Id
    @Column (name = "cityid")
    private Long cityId;
    @Column (name = "city")
    private String city;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "stateid")
    @JsonBackReference
    private State state;
}
