package com.example.iscae.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoursDto {

    private Long id;
    private Date dateDebut;
    private Date dateFin;

    private ProfesseurDto professeurDto;

    private FiliereDto filiereDto;

}
