package com.pulak.springframework.petclinic.services.map;

import com.pulak.springframework.petclinic.model.Vet;
import com.pulak.springframework.petclinic.services.SpecialtyService;
import com.pulak.springframework.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if(object != null){
            if(object.getSpecialties() != null){
                object.getSpecialties().forEach(specialty -> {
                    if(specialty.getId() == null)
                        specialty.setId(specialtyService.save(specialty).getId());
                });
            }
            return super.save(object);
        }
        return null;
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
