package com.pulak.springframework.petclinic.services;

import com.pulak.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService <Owner, Long>{
    Owner findByLastName(String lastName);
}
