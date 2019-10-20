package experiments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Tests the gator's choice of tonics.
 *
 * @author Douglas Luman
 */
public class TestTonic {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Declare file and scanner objects.
    File testResults = null;
    Scanner input = null;
    // Connect file contents to Scanner object.
    try {
      testResults = new File("inputs/results.list");
      input = new Scanner(testResults);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    boolean works;
    int totalWorks = 0;
    int totalFails = 0;
    int count = 0;
    while (input.hasNext()) {
      works = input.nextBoolean();
      if (works) {
        totalWorks++;
      } else {
        totalFails++;
      }
      if ((count + 1) % 10 == 0) {
        progress(totalWorks, count + 1);
      }
      count++;
    }
    Fraction working = new Fraction(totalWorks, count);
    Fraction failing = new Fraction(totalFails, count);
    System.out.println();
    System.out.println("Worked in " + working + " cases (" 
                       + working.fmtPercent() + ")");
    System.out.println("Failed in " + failing + " cases ("
                       + failing.fmtPercent() + ")");    
  }
  
  /** Updates console with progress report.
   *
   * @param works Number of times the tonic has worked
   * @param count Number of times the tonic has been tried
   */
  public static void progress(int works, int count) {
    System.out.print(count + " tests:\t");
    System.out.print(works + " successes\t");
    System.out.println((count - works) + " failures");
  }
}