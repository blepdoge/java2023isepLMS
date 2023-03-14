package org.hpathome.isep;

import lombok.Getter;

public enum Pet {
    TOAD("Toad"),
    CAT("Cat"),
    OWL("Owl"),
    RAT("Rat");

    @Getter
    public String petName;
    Pet(String petName) {
        this.petName = petName;
    }
}
