package com.cetin.education.springframework.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
@Service("petservice")
@Profile({"dog","default"})
public class DogPetService implements PetService{
    @Override
    public String getPetType() {
        return "Dogs are the best!";
    }
}
