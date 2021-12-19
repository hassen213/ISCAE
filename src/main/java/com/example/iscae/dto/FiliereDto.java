package com.example.iscae.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FiliereDto {

    private Long id;
    public String nom;

    private Collection<CoursDto> coursDtos;

    private Collection<EtudientDto> EtudientsDtos;
}
