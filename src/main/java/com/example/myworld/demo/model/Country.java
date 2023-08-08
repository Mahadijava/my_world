package com.example.myworld.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Country {
    @Id
    @Column (name = "countryid")
    private String countryId;
    @Column (name = "country")
    private String country;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true )
    @JsonManagedReference
    private List<State>states = new ArrayList<>();
}
