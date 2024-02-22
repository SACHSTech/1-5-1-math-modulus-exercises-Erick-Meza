class Rads extends ConsoleProgram {

  /**
  * A program that converts a measurement in degrees into radians
  * @author: Erick M
  */
  
  public void run() {
    
    // declares variables
    double dblDegrees;
    double dblRadians;

    // receives degree input
    dblDegrees = readDouble("Please enter a degree: ");

    // calculates the measurement in radians
    dblRadians = Math.toRadians(dblDegrees);

    // outputs the result
    System.out.println("The degree " + dblDegrees + " in radians is " + dblRadians);
  }
}