package com.cetin.custom.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator3 {
  private final MathFunction mathFunction;

  public Calculator3(@Qualifier("cos") MathFunction mathFunction) {
    this.mathFunction = mathFunction;
  }
  public double doCalculation(double arg) {
    return mathFunction.calculate(arg);
  }
}
