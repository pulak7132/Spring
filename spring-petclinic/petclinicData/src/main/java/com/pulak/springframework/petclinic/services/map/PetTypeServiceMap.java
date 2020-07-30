package com.pulak.springframework.petclinic.services.map;

import com.pulak.springframework.petclinic.model.PetType;
import com.pulak.springframework.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService {
}
