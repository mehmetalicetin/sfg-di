package com.cetin.custom.qualifier;

import org.springframework.stereotype.Component;

@Component("sin")
public class Sin implements MathFunction {
  @Override
  public double calculate(double arg) {
    return Math.sin(arg);
  }

  @Override
  public String getName() {
    return "sin";
  }
}
