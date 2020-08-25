package com.pulak.springframework.petclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Visit extends BaseEntity {
    LocalDate date;
    @ManyToOne
    @JoinColumn(name = "pet_id")
    Pet pet;
    String Description;
}
