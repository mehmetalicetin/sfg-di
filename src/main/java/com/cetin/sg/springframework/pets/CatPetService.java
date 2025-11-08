package com.cetin.sg.springframework.pets;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
public class CatPetService implements PetService{
    @Override
    public String getPetType() {
        return "Cats are the best!";
    }
}
