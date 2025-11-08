package com.cetin.custom.customqualifier3;

import org.springframework.stereotype.Component;

@Component
@Home(city = "Konya")
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
