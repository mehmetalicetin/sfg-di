package com.cetin.custom.customqualifier3;

import org.springframework.stereotype.Component;

@Component
@Office(city = "Antalya")
public class OfficeAddress2 implements Address {
  @Override
  public String getAddress() {
    return "Antalya";
  }

  @Override
  public String toString() {
    return "OfficeAddress [City = "+ getAddress()+ "]";
  }
}
