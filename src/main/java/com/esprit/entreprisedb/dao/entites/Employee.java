package com.esprit.entreprisedb.dao.entites;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Matricule;
    public String Nom;
    public String Email;
    public String Cat;
    public double AnneRecruit;
    @ManyToOne
    Entreprise entreprise;
}
