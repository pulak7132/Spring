package com.pulak.springframework.petclinic.repositories;

import com.pulak.springframework.petclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
