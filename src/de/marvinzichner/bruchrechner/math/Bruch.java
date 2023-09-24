package de.marvinzichner.bruchrechner.math;

import de.marvinzichner.bruchrechner.exception.CalculationException;
import de.marvinzichner.bruchrechner.util.IOUtil;

public class Bruch {

  private int zaehler;
  private int nenner;

  /**
   * Construct a bruch.
   */
  public Bruch() {
    this.zaehler = 0;
    this.nenner = 0;
  }

  /**
   * Construct a bruch with the given arguments.
   *
   * @param zaehler
   * @param nenner
   */
  public Bruch(int zaehler, int nenner) {
    this.zaehler = zaehler;
    this.nenner = nenner;
  }

  /**
   * Get nenner.
   *
   * @return
   */
  public int getNenner() {
    return nenner;
  }

  /**
   * get zaehler
   *
   * @return
   */
  public int getZaehler() {
    return zaehler;
  }

  /**
   * Construct a new Bruch by a given string (e.g. 1/4)
   *
   * @param input
   * @return
   * @throws CalculationException
   */
  public static Bruch of(String input) throws CalculationException {
    String[] parts = IOUtil.cleanup(input).split("/");

    if (parts.length != 2) {
      throw new CalculationException("Der Bruch wurde falsch definiert");
    }

    int zaehler = IOUtil.convertToNumber(parts[0]);
    int nenner = IOUtil.convertToNumber(parts[1]);

    return new Bruch(zaehler, nenner);
  }

  /**
   * Method to "erweitern" the bruch by a given factor.
   *
   * @param faktor
   * @return
   */
  public Bruch erweitern(int faktor) {
    this.zaehler = this.zaehler * faktor;
    this.nenner = this.nenner * faktor;
    return this;
  }

  /**
   * Method to "kürzen" a bruch with the "größten gemeinsamen teiler"
   * @return
   */
  public Bruch kuerzen() {
    final int ggt = MathUtils.ggt(this.zaehler, this.nenner);
    this.zaehler = this.zaehler / ggt;
    this.nenner = this.nenner / ggt;
    return this;
  }

  @Override
  public String toString() {
    return zaehler + "/" + nenner;
  }
}
