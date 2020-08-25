package com.pulak.springframework.petclinic.services.map;

import com.pulak.springframework.petclinic.model.Visit;
import com.pulak.springframework.petclinic.services.PetService;
import com.pulak.springframework.petclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {
    private PetService petService;

    public VisitServiceMap(PetService petService) {
        this.petService = petService;
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit object) {
        if(object != null){
            if(object.getPet() != null){
                    if(object.getPet().getId() == null)
                        object.getPet().setId(petService.save(object.getPet()).getId());
            }
            return super.save(object);
        }
        return null;
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
