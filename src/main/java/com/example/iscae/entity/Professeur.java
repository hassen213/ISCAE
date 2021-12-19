package com.example.iscae.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    @OneToMany(mappedBy = "professeur")
    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    private Collection<MatiereProfesseur> matieres;
    @OneToMany(mappedBy = "professeur")
    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    private Collection<Cours> cours;

}
