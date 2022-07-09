package com.gdc.application.repository;

import com.gdc.application.entities.Partenaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartenariaRepository extends JpaRepository<Partenaria, Long> {
}
