package com.esprit.entreprisedb.dao.entites;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Set;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEntreprise;
    private String nomEntreprise;
    private String adresseEntreprise;

    private String typeEntreprise;
    private String descriptionEntreprise;

    @OneToMany(mappedBy = "entreprise")
    List<Employee>employees;

    @ManyToMany (mappedBy = "entreprises")
    List<Customer>customers;

}
