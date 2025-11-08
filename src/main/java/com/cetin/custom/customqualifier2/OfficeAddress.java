package com.cetin.custom.customqualifier2;

import org.springframework.stereotype.Component;

@Component
@Office
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
