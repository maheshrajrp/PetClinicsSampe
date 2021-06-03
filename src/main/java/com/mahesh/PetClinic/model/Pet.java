package com.mahesh.PetClinic.model;

import java.time.LocalDate;

public class Pet {
    private PetType pet_type;
    private Owner owner;
    private LocalDate birth_date;

    public Pet() {
    }

    public Pet(PetType pet_type, Owner owner, LocalDate birth_date) {
        this.pet_type = pet_type;
        this.owner = owner;
        this.birth_date = birth_date;
    }

    public PetType getPet_type() {
        return pet_type;
    }

    public void setPet_type(PetType pet_type) {
        this.pet_type = pet_type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }
}
