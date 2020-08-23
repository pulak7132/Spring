package com.pulak.springframework.petclinic.repositories;

import com.pulak.springframework.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
