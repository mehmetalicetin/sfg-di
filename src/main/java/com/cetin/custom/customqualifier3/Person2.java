package com.cetin.custom.customqualifier3;

import org.springframework.stereotype.Component;

@Component
public class Person2 {
  private final Address homeAddress;
  private final Address officeAddress;

  public Person2(@Home(city = "Konya") Address homeAddress,
      @Office(city = "Antalya") Address officeAddress) {
    this.homeAddress = homeAddress;
    this.officeAddress = officeAddress;
  }

  @Override
  public String toString() {
    return "Person{" + "homeAddress=" + homeAddress + ", officeAddress=" + officeAddress + '}';
  }
}
