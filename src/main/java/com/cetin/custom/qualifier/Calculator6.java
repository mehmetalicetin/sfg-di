package com.cetin.custom.qualifier;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Calculator6 {
  private final Map<String,MathFunction> mathFunctionMap;

  public Calculator6(Collection<MathFunction> mathFunctions, MapBuilder<String, MathFunction> mapBuilder) {
    this.mathFunctionMap = mapBuilder.toMap(mathFunctions, MathFunction::getName);
  }

  public double doCalculation(String name, double arg) {
    MathFunction mathFunction = mathFunctionMap.get(name);
    Objects.requireNonNull(Objects.requireNonNull(mathFunction, "MathFunction is null"));
    return mathFunction.calculate(arg);
  }
}
