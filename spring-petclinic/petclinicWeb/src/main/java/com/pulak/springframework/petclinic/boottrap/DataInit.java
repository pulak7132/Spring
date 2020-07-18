package com.pulak.springframework.petclinic.boottrap;

import com.pulak.springframework.petclinic.model.Owner;
import com.pulak.springframework.petclinic.model.Vet;
import com.pulak.springframework.petclinic.services.OwnerService;
import com.pulak.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInit(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Raju");
        owner1.setLastName("Raja");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Kuki");
        owner2.setLastName("Naga");

        ownerService.save(owner2);
        System.out.println("Loading Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Wadde");
        vet1.setLastName("Lok");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Motte");
        vet2.setLastName("Rok");

        vetService.save(vet2);
        System.out.println("Loading Vets....");

    }
}
