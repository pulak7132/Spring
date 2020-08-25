package com.pulak.springframework.petclinic.services.map;

import com.pulak.springframework.petclinic.model.PetType;
import com.pulak.springframework.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService {
}
