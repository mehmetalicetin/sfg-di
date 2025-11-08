package com.cetin.custom.customqualifier2;

import org.springframework.stereotype.Component;

@Component
@Home
public class HomeAddress implements Address {

  @Override
  public String getAddress() {
    return "Istanbul";
  }

  @Override
  public String toString() {
    return "HomeAddress [City = "+ getAddress()+ "]";
  }
}
