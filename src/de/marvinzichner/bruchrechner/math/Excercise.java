package de.marvinzichner.bruchrechner.math;

public class Excercise {

  private final Bruch bruch1;
  private final Bruch bruch2;
  private final Operation operation;

  public Excercise(Bruch bruch1, Bruch bruch2, Operation operation) {
    this.bruch1 = bruch1;
    this.bruch2 = bruch2;
    this.operation = operation;
  }

  public Bruch getBruch1() {
    return bruch1;
  }

  public Bruch getBruch2() {
    return bruch2;
  }

  public Operation getOperation() {
    return operation;
  }
}
