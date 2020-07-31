package com.pulak.springframework.petclinic.boottrap;

import com.pulak.springframework.petclinic.model.Owner;
import com.pulak.springframework.petclinic.model.PetType;
import com.pulak.springframework.petclinic.model.Vet;
import com.pulak.springframework.petclinic.services.OwnerService;
import com.pulak.springframework.petclinic.services.PetTypeService;
import com.pulak.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataInit(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCat = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Raju");
        owner1.setLastName("Raja");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Kuki");
        owner2.setLastName("Naga");

        ownerService.save(owner2);
        System.out.println("Loading Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Wadde");
        vet1.setLastName("Lok");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Motte");
        vet2.setLastName("Rok");

        vetService.save(vet2);
        System.out.println("Loading Vets....");

    }
}
