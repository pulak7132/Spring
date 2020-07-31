package com.pulak.springframework.petclinic.services.map;

import com.pulak.springframework.petclinic.model.Specialty;
import com.pulak.springframework.petclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty,Long> implements SpecialtyService {
}
