package com.gdc.application.repository;

import com.gdc.application.entities.Diploma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiplomaRepository extends JpaRepository<Diploma, Long> {
}
