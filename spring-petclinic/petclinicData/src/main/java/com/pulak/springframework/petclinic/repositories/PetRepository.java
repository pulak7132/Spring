package com.pulak.springframework.petclinic.repositories;

import com.pulak.springframework.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
