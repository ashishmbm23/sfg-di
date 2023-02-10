package com.ashish.pets;

/**
 * Created by jt on 12/28/19.
 */
//@Service("pet")
//@Profile("cat")
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
