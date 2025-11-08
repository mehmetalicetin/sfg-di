package com.cetin.custom.customqualifier3;

import org.springframework.stereotype.Component;

@Component
public class Person {
  private final Address homeAddress;
  private final Address officeAddress;

  public Person(@Home(city = "Istanbul") Address homeAddress,
      @Office(city = "Alanya") Address officeAddress) {
    this.homeAddress = homeAddress;
    this.officeAddress = officeAddress;
  }

  @Override
  public String toString() {
    return "Person{" + "homeAddress=" + homeAddress + ", officeAddress=" + officeAddress + '}';
  }
}
