package com.ashish.pets;

/**
 * Created by jt on 12/28/19.
 */
//@Profile({"dog", "default"})
//@Service("pet")
public class DogPetService implements PetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}
