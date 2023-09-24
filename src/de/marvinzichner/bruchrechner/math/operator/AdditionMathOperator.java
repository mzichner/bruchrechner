package de.marvinzichner.bruchrechner.math.operator;

import de.marvinzichner.bruchrechner.math.Bruch;
import de.marvinzichner.bruchrechner.math.Excercise;
import de.marvinzichner.bruchrechner.math.Operation;

public class AdditionMathOperator implements MathOperator {

  @Override
  public boolean supports(Operation operation) {
    return Operation.ADDITION.equals(operation);
  }

  @Override
  public Bruch operate(Excercise excercise) {
    int zaehler = excercise.getBruch1().getZaehler() + excercise.getBruch2().getZaehler();
    int nenner = excercise.getBruch1().getNenner();
    return new Bruch(zaehler, nenner);
  }
}
