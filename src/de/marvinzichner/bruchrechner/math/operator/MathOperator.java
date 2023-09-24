package de.marvinzichner.bruchrechner.math.operator;

import de.marvinzichner.bruchrechner.math.Bruch;
import de.marvinzichner.bruchrechner.math.Excercise;
import de.marvinzichner.bruchrechner.math.Operation;

public interface MathOperator {

  boolean supports(Operation operation);

  Bruch operate(Excercise excercise);
}
