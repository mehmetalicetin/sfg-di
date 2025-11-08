package com.cetin.custom.customqualifier4;

import org.springframework.stereotype.Component;

@Component
public class Person {
  private final Address homeAddress;
  private final Address officeAddress;

  public Person(@Home Address homeAddress, @Office Address officeAddress) {
    this.homeAddress = homeAddress;
    this.officeAddress = officeAddress;
  }

  @Override
  public String toString() {
    return "Person{" + "homeAddress=" + homeAddress + ", officeAddress=" + officeAddress + '}';
  }
}
