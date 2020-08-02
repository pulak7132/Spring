package com.pulak.springframework.petclinic.boottrap;

import com.pulak.springframework.petclinic.model.*;
import com.pulak.springframework.petclinic.services.OwnerService;
import com.pulak.springframework.petclinic.services.PetTypeService;
import com.pulak.springframework.petclinic.services.SpecialtyService;
import com.pulak.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataInit implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataInit(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if (count== 0)
            loadData();
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCat = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        surgery.setDescription("Surgery");
        Specialty savedSurgery = specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        dentistry.setDescription("dentistry");
        Specialty savedDentistry = specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Raju");
        owner1.setLastName("Raja");
        owner1.setAddress("32 Weston Street");
        owner1.setCity("Jhumari Talaiya");
        owner1.setTelephone("984747474");
        Pet rajuPet = new Pet();
        rajuPet.setOwner(owner1);
        rajuPet.setName("Kutta Kamina");
        rajuPet.setPetType(savedDog);
        rajuPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(rajuPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Kuki");
        owner2.setLastName("Naga");
        owner2.setAddress("44 gaon Street");
        owner2.setCity("Jhumari Talaiya");
        owner2.setTelephone("643246434");
        Pet kukiPet = new Pet();
        kukiPet.setOwner(owner2);
        kukiPet.setName("billi");
        kukiPet.setPetType(savedCat);
        kukiPet.setBirthDate(LocalDate.now());
        owner2.getPets().add(kukiPet);
        ownerService.save(owner2);

        System.out.println("Loading Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Wadde");
        vet1.setLastName("Lok");
        vet1.getSpecialties().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Motte");
        vet2.setLastName("Rok");

        vetService.save(vet2);
        System.out.println("Loading Vets....");
        vet2.getSpecialties().add(savedSurgery);
    }
}
