package com.gdc.application.repository;

import com.gdc.application.entities.OrganisationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationTypeRepository extends JpaRepository<OrganisationType, Long> {
}
