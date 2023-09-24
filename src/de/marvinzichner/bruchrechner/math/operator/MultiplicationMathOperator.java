package de.marvinzichner.bruchrechner.math.operator;

import de.marvinzichner.bruchrechner.math.Bruch;
import de.marvinzichner.bruchrechner.math.Excercise;
import de.marvinzichner.bruchrechner.math.Operation;

public class MultiplicationMathOperator implements MathOperator {

  @Override
  public boolean supports(Operation operation) {
    return Operation.MULTIPLICATION.equals(operation);
  }

  @Override
  public Bruch operate(Excercise excercise) {
    int zaehler = excercise.getBruch1().getZaehler() * excercise.getBruch2().getZaehler();
    int nenner = excercise.getBruch1().getNenner() * excercise.getBruch2().getNenner();
    return new Bruch(zaehler, nenner);
  }
}
