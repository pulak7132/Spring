package com.pulak.springframework.petclinic.services.map;

import com.pulak.springframework.petclinic.model.Pet;
import com.pulak.springframework.petclinic.services.PetService;
import com.pulak.springframework.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    private final PetTypeService petTypeService;

    public PetServiceMap(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        if(object != null){
            if(object.getPetType().getId() == null)
                petTypeService.save(object.getPetType());
            return super.save(object);
        }
        return null;
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
