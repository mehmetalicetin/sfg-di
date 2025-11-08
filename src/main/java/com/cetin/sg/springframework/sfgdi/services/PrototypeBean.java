package com.cetin.sg.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author mehmetali.cetin
 * @Date 2022-08-14
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("Creating Protoype Beannnnnn..................");
    }

    public void getMyScope(){
        System.out.println("I'm a prototype");
    }
}
