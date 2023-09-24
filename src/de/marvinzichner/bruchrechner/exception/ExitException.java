package de.marvinzichner.bruchrechner.exception;

public class ExitException extends Exception {


  /**
   * Construct an Exit Exception.
   */
  public ExitException() {
    super("Exit Called");
  }
}
