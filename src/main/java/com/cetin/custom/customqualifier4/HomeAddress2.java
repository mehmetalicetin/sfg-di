package com.cetin.custom.customqualifier4;

import org.springframework.stereotype.Component;

@Component
@Home
public class HomeAddress2 implements Address {

  @Override
  public String getAddress() {
    return "Konya";
  }

  @Override
  public String toString() {
    return "HomeAddress [City = "+ getAddress()+ "]";
  }
}
