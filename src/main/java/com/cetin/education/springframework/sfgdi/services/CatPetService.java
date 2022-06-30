package com.cetin.education.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
@Service("petservice")
@Profile("cat")
public class CatPetService implements PetService{
    @Override
    public String getPetType() {
        return "Cats are the best!";
    }
}
