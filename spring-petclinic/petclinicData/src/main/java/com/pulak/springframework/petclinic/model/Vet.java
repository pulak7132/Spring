package com.pulak.springframework.petclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Vet extends Person {
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    Set<Specialty> specialties;

    public Vet() {
        specialties = new HashSet<>();
    }

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }

}
