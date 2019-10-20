package experiments;

import java.text.NumberFormat;

/** Manages creation of Fraction objects (rational numbers).
 *
 * @author Douglas Luman
 */  
public class Fraction {
  
  private final int numer;
  private final int denom;
   
  /** Constructor.
   *
   * @param numer Numerator
   * @param denom Denominator
   */
  public Fraction(int numer, int denom) {
    this.numer = numer;
    this.denom = denom;
  }
  
  /** Formats the fraction as a percentage.
   *
   */
  public String fmtPercent() {
    NumberFormat fmt = NumberFormat.getPercentInstance();
    fmt.setMinimumFractionDigits(1);
    double quotient = (double)this.numer / (double)this.denom;
    return fmt.format(quotient);
  }
  
  /** Creates the String form of a fraction.
   *
   */
  public String toString() {
    String result = this.numer + "/" + this.denom;
    return result;
  }
}