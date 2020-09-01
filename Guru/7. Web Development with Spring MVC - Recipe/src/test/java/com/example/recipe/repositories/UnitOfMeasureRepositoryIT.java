package com.example.recipe.repositories;

import com.example.recipe.domain.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(SpringExtension.class)
@DataJpaTest
class UnitOfMeasureRepositoryIT {
    UnitOfMeasureRepository unitOfMeasureRepository;
    @Autowired
    public UnitOfMeasureRepositoryIT(UnitOfMeasureRepository unitOfMeasureRepository) {
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    @DirtiesContext
    void findByDescription() throws Exception{
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        assertEquals("Teaspoon", uomOptional.get().getDescription());
    }
    @Test
    void findByDescriptionCup() throws Exception{
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Cup");
        assertEquals("Cup", uomOptional.get().getDescription());
    }
}