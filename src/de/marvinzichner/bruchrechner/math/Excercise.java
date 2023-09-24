package de.marvinzichner.bruchrechner.math;

public class Excercise {

  private final Bruch bruch1;
  private final Bruch bruch2;
  private final Operation operation;

  /**
   * Construct a new exercise.
   *
   * @param bruch1
   * @param bruch2
   * @param operation
   */
  public Excercise(Bruch bruch1, Bruch bruch2, Operation operation) {
    this.bruch1 = bruch1;
    this.bruch2 = bruch2;
    this.operation = operation;
  }

  /**
   * Get the bruch that was created on position 1.
   *
   * @return
   */
  public Bruch getBruch1() {
    return bruch1;
  }

  /**
   * Get the bruch that was created on position 2.
   *
   * @return
   */
  public Bruch getBruch2() {
    return bruch2;
  }

  /**
   * Get the operation of the current exercise.
   *
   * @return
   */
  public Operation getOperation() {
    return operation;
  }
}
