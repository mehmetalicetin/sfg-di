package com.cetin.custom.qualifier;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class Calculator5 {
  private final Map<String,MathFunction> mathFunctions;

  public Calculator5(List<MathFunction> mathFunctions) {
    this.mathFunctions = mathFunctions.stream().collect(Collectors.toMap(MathFunction::getName, m -> m));
  }

  public double doCalculation(String name, double arg) {
    MathFunction mathFunction = mathFunctions.get(name);
    Objects.requireNonNull(Objects.requireNonNull(mathFunction, "MathFunction is null"));
    return mathFunction.calculate(arg);
  }
}
