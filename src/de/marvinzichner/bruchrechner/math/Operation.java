package de.marvinzichner.bruchrechner.math;

import de.marvinzichner.bruchrechner.exception.CalculationException;
import java.util.Arrays;

public enum Operation {
  ADDITION("+"),
  SUBTRACTION("-"),
  MULTIPLICATION("*"),
  DIVISION("/");

  private String sign;

  /**
   * Construct the Operation.
   *
   * @param sign
   */

  Operation(String sign) {
    this.sign = sign;
  }

  /**
   * Get the current sign that indicates the operation.
   * @return
   */

  public String getSign() {
    return this.sign;
  }

  /**
   * Get the operation by a given sign. Otherwise, throws an exception.
   * @param sign
   * @return
   * @throws CalculationException
   */
  public static Operation getBySign(String sign) throws CalculationException {
    return Arrays.stream(Operation.values())
        .filter(s -> s.getSign().equals(sign))
        .findFirst()
        .orElseThrow(() -> new CalculationException("Der Operant wurde nicht gefunden"));
  }
}
