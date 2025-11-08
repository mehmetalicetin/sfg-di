package com.cetin.custom.qualifier;

import org.springframework.stereotype.Component;

@Component("tan")
public class Tan implements MathFunction {
  @Override
  public double calculate(double arg) {
    return Math.tan(arg);
  }

  @Override
  public String getName() {
    return "tan";
  }
}
