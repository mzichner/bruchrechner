package de.marvinzichner.bruchrechner.math;

import de.marvinzichner.bruchrechner.exception.CalculationException;
import de.marvinzichner.bruchrechner.util.IOUtil;

public class Bruch {

  private int zaehler;
  private int nenner;

  public Bruch() {
    this.zaehler = 0;
    this.nenner = 0;
  }

  public Bruch(int zaehler, int nenner) {
    this.zaehler = zaehler;
    this.nenner = nenner;
  }

  public int getNenner() {
    return nenner;
  }

  public int getZaehler() {
    return zaehler;
  }

  public static Bruch of(String input) throws CalculationException {
    String[] parts = IOUtil.cleanup(input).split("/");

    if (parts.length != 2) {
      throw new CalculationException("Der Bruch wurde falsch definiert");
    }

    int zaehler = IOUtil.convertToNumber(parts[0]);
    int nenner = IOUtil.convertToNumber(parts[1]);

    return new Bruch(zaehler, nenner);
  }

  public Bruch erweitern(int faktor) {
    this.zaehler = this.zaehler * faktor;
    this.nenner = this.nenner * faktor;
    return this;
  }

  public Bruch kuerzen() {
    final int kgt = MathUtils.kgt(this.zaehler, this.nenner);
    this.zaehler = this.zaehler / kgt;
    this.nenner = this.nenner / kgt;
    return this;
  }

  @Override
  public String toString() {
    return zaehler + "/" + nenner;
  }
}
