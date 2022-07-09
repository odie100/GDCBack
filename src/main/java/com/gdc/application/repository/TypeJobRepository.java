package com.gdc.application.repository;

import com.gdc.application.entities.TypeJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeJobRepository extends JpaRepository<TypeJob, Long> {
}
