package de.marvinzichner.bruchrechner.parser;

import de.marvinzichner.bruchrechner.exception.CalculationException;
import de.marvinzichner.bruchrechner.math.Bruch;
import de.marvinzichner.bruchrechner.math.Excercise;
import de.marvinzichner.bruchrechner.math.Operation;
import de.marvinzichner.bruchrechner.util.IOUtil;

public class BruchParser {

  private static final String SPACE = " ";

  /**
   * Parse an given stringified bruch.
   *
   * @param input
   * @return
   * @throws CalculationException
   */
  public Excercise parse(String input) throws CalculationException {
    String[] parts = input.split(SPACE);

    if (parts.length != 3) {
      throw new CalculationException("Die Anzahl der Parameter ist falsch");
    }

    Bruch b1 = Bruch.of(parts[0]);
    Bruch b2 = Bruch.of(parts[2]);
    Operation operation = IOUtil.convertToOperation(parts[1]);

    return new Excercise(b1, b2, operation);
  }
}
