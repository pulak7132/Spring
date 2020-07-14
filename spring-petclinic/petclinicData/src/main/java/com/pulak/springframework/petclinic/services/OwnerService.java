package com.pulak.springframework.petclinic.services;

import com.pulak.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService <Owner, Long>{
    Owner findByLastName();
}
