package com.cetin.custom.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
  @Autowired
  private MathFunction sin;
  @Autowired
  private MathFunction cos;
  @Autowired
  private MathFunction tan;

  public double doCalculation(String functionName, double arg) {
    MathFunction mathFunction = null;
    switch (functionName) {
      case "sin":
        mathFunction = sin;
        break;
      case "cos":
        mathFunction = cos;
        break;
      case "tan":
        mathFunction = tan;
        break;
      default:
    }
    return mathFunction.calculate(arg);
  }

}
