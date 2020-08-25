package com.pulak.springframework.petclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{
    String name;
}
