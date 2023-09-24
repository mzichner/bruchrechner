package de.marvinzichner.bruchrechner;

import de.marvinzichner.bruchrechner.exception.CalculationException;
import de.marvinzichner.bruchrechner.exception.ExitException;
import de.marvinzichner.bruchrechner.math.Bruch;
import de.marvinzichner.bruchrechner.math.Excercise;
import de.marvinzichner.bruchrechner.math.MathUtils;
import de.marvinzichner.bruchrechner.math.operator.AdditionMathOperator;
import de.marvinzichner.bruchrechner.math.operator.DivisionMathOperator;
import de.marvinzichner.bruchrechner.math.operator.MathOperator;
import de.marvinzichner.bruchrechner.math.operator.MultiplicationMathOperator;
import de.marvinzichner.bruchrechner.math.operator.SubtractionMathOperator;
import de.marvinzichner.bruchrechner.parser.BruchParser;
import de.marvinzichner.bruchrechner.util.IOUtil;
import java.util.List;

public class Application {

  private final List<? extends MathOperator> mathOperators;
  private boolean isRunning;
  private final BruchParser bruchParser;

  /**
   * The constructor.
   */
  public Application() {
    isRunning = true;
    bruchParser = new BruchParser();
    mathOperators = List.of(
        new AdditionMathOperator(),
        new SubtractionMathOperator(),
        new MultiplicationMathOperator(),
        new DivisionMathOperator()
    );
  }

  /**
   * The main loop that runs the application.
   */
  public void run() {
    while (isRunning) {
      try {

        System.out.println("Bitte geben Sie die Rechnung ein");
        String input = IOUtil.getUserInput();
        IOUtil.handleExit(input);

        Excercise excercise = bruchParser.parse(input);
        MathUtils.erweitern(excercise);

        mathOperators.stream()
            .filter(mathOperator -> mathOperator.supports(excercise.getOperation()))
            .findFirst()
            .ifPresent(mathOperator -> {
              System.out.println(mathOperator.operate(excercise).kuerzen().toString());
            });

      } catch (CalculationException e) {
        System.out.println("Es gab ein Problem mit Ihrer Rechnung: " + e.getMessage());
      } catch (ExitException e) {
        System.out.println("Bye...");
        isRunning = false;
      }
    }
  }
}
