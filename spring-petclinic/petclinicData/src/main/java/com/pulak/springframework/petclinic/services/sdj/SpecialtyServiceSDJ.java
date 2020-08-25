package com.pulak.springframework.petclinic.services.sdj;

import com.pulak.springframework.petclinic.model.Specialty;
import com.pulak.springframework.petclinic.repositories.SpecialtyRepository;
import com.pulak.springframework.petclinic.services.SpecialtyService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SDJ")
@Primary
public class SpecialtyServiceSDJ implements SpecialtyService {
    SpecialtyRepository specialtyRepository;

    public SpecialtyServiceSDJ(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        specialtyRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Specialty findById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
