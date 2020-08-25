package com.pulak.springframework.petclinic.services.sdj;

import com.pulak.springframework.petclinic.model.Pet;
import com.pulak.springframework.petclinic.repositories.PetRepository;
import com.pulak.springframework.petclinic.services.PetService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SDJ")
@Primary
public class PetServiceSDJ implements PetService {
    PetRepository petRepository;

    public PetServiceSDJ(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
