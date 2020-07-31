package com.pulak.springframework.petclinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity {
    LocalDate date;
    Pet pet;
    String Description;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
