package com.pulak.springframework.petclinic.repositories;

import com.pulak.springframework.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    public Owner findByLastName(String lastName);
}
