package com.pulak.springframework.petclinic.model;

import javax.persistence.Entity;

@Entity
public class Specialty  extends BaseEntity{
    String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
