package com.cetin.custom.qualifier;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Component
public class Calculator4 {
  private final List<MathFunction> mathFunctions;

  public Calculator4(List<MathFunction> mathFunctions) {
    this.mathFunctions = mathFunctions;
  }

  public double doCalculation(String name, double arg) {
    Optional<MathFunction> mathFunction = mathFunctions
        .stream()
        .filter(m -> m.getName().equals(name))
        .findAny();
    return mathFunction
        .map(function -> function.calculate(arg))
        .orElseThrow(()-> new NoSuchElementException("There is no such MathFunction"));
  }
}
