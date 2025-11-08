package com.cetin.custom.customqualifier;

import org.springframework.stereotype.Component;

@Component
@Home(city = "Istanbul")
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
