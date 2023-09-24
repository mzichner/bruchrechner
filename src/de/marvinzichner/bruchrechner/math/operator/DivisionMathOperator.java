package de.marvinzichner.bruchrechner.math.operator;

import de.marvinzichner.bruchrechner.math.Bruch;
import de.marvinzichner.bruchrechner.math.Excercise;
import de.marvinzichner.bruchrechner.math.Operation;

public class DivisionMathOperator implements MathOperator {

  @Override
  public boolean supports(Operation operation) {
    return Operation.DIVISION.equals(operation);
  }

  @Override
  public Bruch operate(Excercise excercise) {
    int zaehler = excercise.getBruch1().getZaehler() * excercise.getBruch2().getNenner();
    int nenner = excercise.getBruch1().getNenner() * excercise.getBruch2().getZaehler();
    return new Bruch(zaehler, nenner);
  }
}
