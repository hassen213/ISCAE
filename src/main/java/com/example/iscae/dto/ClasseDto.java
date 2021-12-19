package com.example.iscae.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClasseDto {

    private Long id;
    private String nom;
    private Collection<EtudientDto> EtudientDtos;
}
