package com.example.iscae.repository;

import com.example.iscae.entity.Etudient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudientRepository extends JpaRepository<Etudient, Long> {
}
