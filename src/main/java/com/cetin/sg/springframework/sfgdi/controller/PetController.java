package com.cetin.sg.springframework.sfgdi.controller;

import com.cetin.sg.springframework.pets.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
@Controller
public class PetController {
    private final PetService petService;

    public PetController(@Qualifier("petservice") PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
       return petService.getPetType();
    }
}
