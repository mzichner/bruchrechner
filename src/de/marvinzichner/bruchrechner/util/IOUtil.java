package de.marvinzichner.bruchrechner.util;

import de.marvinzichner.bruchrechner.exception.CalculationException;
import de.marvinzichner.bruchrechner.exception.ExitException;
import de.marvinzichner.bruchrechner.math.Operation;
import java.util.Scanner;

public class IOUtil {

  public static final String SPACE = " ";
  public static final String EMPTY = "";
  public static final String EXIT = "exit";

  /**
   * Convert the given string into an number. Otherwise throw an exception.
   *
   * @param input
   * @return
   * @throws CalculationException
   */
  public static int convertToNumber(String input) throws CalculationException {
    try {
      return Integer.parseInt(input);
    } catch (Exception e) {
      throw new CalculationException("Ein Teil des Bruchs enthält keine auswertbaren Zahlen");
    }
  }

  /**
   * Converts the input to Operation if sign matches. Otherwise an exception is thrown.
   *
   * @param input
   * @return
   * @throws CalculationException
   */
  public static Operation convertToOperation(String input) throws CalculationException {
    try {
      return Operation.getBySign(input);
    } catch (Exception e) {
      throw new CalculationException("Der Operant konnte nicht ermittelt werden (+, -, *, /)");
    }
  }

  /**
   * Cleanup the given string. Cleanup is defined as removing all spaces.
   *
   * @param input
   * @return
   */
  public static String cleanup(String input) {
    return input.replaceAll(SPACE, EMPTY);
  }

  /**
   * Wrapper to get the stringified user input via console.
   *
   * @return
   */
  public static String getUserInput() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  /**
   * Handle the exit command.
   *
   * @param input
   * @throws ExitException
   */
  public static void handleExit(String input) throws ExitException {
    if (EXIT.equals(input)) {
      throw new ExitException();
    }
  }
}
