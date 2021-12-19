package com.example.iscae.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EtudientDto {

    private Long id;
    private String nom;
    private String prenom;
    private Long apogge;

    private FiliereDto filiere;

    private ClasseDto classe;




}
