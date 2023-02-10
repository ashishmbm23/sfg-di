package com.ashish.pets;

public class PetServiceFactory {

    public PetService getPetService(String petType){
        if(petType != null){
            switch (petType){
                case "dog": {
                    return new DogPetService();
                }
                case "cat": {
                    return new CatPetService();
                }
                default:{
                    return new DogPetService();
                }
            }
        }else {
            return new DogPetService();
        }
    }
}
