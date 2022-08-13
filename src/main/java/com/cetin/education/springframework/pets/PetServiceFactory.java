package com.cetin.education.springframework.pets;

/**
 * @Author mehmetali.cetin
 * @Date 2022-08-13
 */
public class PetServiceFactory {
    public PetService getPetService(String petType){
        switch (petType){
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
