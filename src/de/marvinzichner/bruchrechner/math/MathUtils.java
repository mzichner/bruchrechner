package de.marvinzichner.bruchrechner.math;

public class MathUtils {

  /**
   * Calculate the "kleinsten gemeinsamen teiler" within passed arguments.
   *
   * @param zahl1
   * @param zahl2
   * @return
   */
  public static int ggt(int zahl1, int zahl2) {
    if (zahl1 == 0) {
      return zahl2;
    }

    while (zahl2 != 0) {
      if (zahl1 > zahl2) {
        zahl1 = zahl1 - zahl2;
      } else {
        zahl2 = zahl2 - zahl1;
      }
    }

    return zahl1;
  }
  
  public static void erweitern(Excercise excercise) {
    final int nenner1 = excercise.getBruch1().getNenner();
    final int nenner2 = excercise.getBruch2().getNenner();
    excercise.getBruch1().erweitern(nenner2);
    excercise.getBruch2().erweitern(nenner1);
  }
}
