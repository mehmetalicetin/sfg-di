package com.cetin.custom.qualifier;

import org.springframework.stereotype.Component;

@Component
public class Calculator2 {
  private final MathFunction sin;
  private final MathFunction cos;
  private final MathFunction tan;

  public Calculator2(MathFunction sin, MathFunction cos, MathFunction tan) {
    this.sin = sin;
    this.cos = cos;
    this.tan = tan;
  }

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
