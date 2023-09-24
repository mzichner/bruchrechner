package de.marvinzichner.bruchrechner.math;

import de.marvinzichner.bruchrechner.exception.CalculationException;
import java.util.Arrays;

public enum Operation {
  ADDITION("+"),
  SUBTRACTION("-"),
  MULTIPLICATION("*"),
  DIVISION("/");

  private String sign;

  Operation(String sign) {
    this.sign = sign;
  }

  public String getSign() {
    return this.sign;
  }

  public static Operation getBySign(String sign) throws CalculationException {
    return Arrays.stream(Operation.values())
        .filter(s -> s.getSign().equals(sign))
        .findFirst()
        .orElseThrow(() -> new CalculationException("Der Operant wurde nicht gefunden"));
  }
}
