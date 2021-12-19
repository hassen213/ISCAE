package com.example.iscae.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfesseurDto {

    private Long id;

    private String nom;
    private String prenom;

    private Collection<MatiereProfesseurDto> matieres;

    private Collection<CoursDto> cours;

}
