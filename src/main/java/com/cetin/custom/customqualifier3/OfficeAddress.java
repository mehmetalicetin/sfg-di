package com.cetin.custom.customqualifier3;

import org.springframework.stereotype.Component;

@Component
@Office(city = "Alanya")
public class OfficeAddress implements Address {
  @Override
  public String getAddress() {
    return "Alanya";
  }

  @Override
  public String toString() {
    return "OfficeAddress [City = "+ getAddress()+ "]";
  }
}
