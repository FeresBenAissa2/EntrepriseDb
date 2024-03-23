package com.esprit.entreprisedb.dao.entites;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCustomer;
    private String nomCustomer;
    private String contactCustomer;


    @ManyToMany
    List<Entreprise> entreprises;
}
