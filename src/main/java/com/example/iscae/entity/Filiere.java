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
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String nom;
    @OneToMany(mappedBy = "filiere")
    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    private Collection<Cours> cours;
    @OneToMany(mappedBy = "filiere")
    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    private Collection<Etudient> Etudients;
}
