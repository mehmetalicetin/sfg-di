package com.cetin.custom.qualifier;

import org.springframework.stereotype.Component;

@Component("cos")
public class Cos implements MathFunction{
  @Override
  public double calculate(double arg) {
    return Math.cos(arg);
  }

  @Override
  public String getName() {
    return "cos";
  }
}
