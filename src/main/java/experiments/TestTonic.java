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
    // Initialize variables
    boolean works;
    int totalWorks = 0;
    int totalFails = 0;
    int count = 0;
    // Set up while loop to use Scanner iterator
    while (input.hasNext()) {
      // Populate boolean to evaluate input result
      works = input.nextBoolean();
      // Branching logic to keep track of various results
      if (works) {
        totalWorks++;
      } else {
        totalFails++;
      }
      // Create a "progress" report every 10 iterations
      if ((count + 1) % 10 == 0) {
        progress(totalWorks, count + 1);
      }
      // Keep track of iterations
      count++;
    }
    // Create Fraction (rational number) object(s)
    Fraction working = new Fraction(totalWorks, count);
    Fraction failing = new Fraction(totalFails, count);
    // Print final report
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
    // Create progress report
    System.out.print(count + " tests:\t");
    System.out.print(works + " successes\t");
    System.out.println((count - works) + " failures");
  }
}