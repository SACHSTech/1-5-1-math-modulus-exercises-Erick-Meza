class Circumference extends ConsoleProgram {

  /**
  * Program asks for a radius in radians from the user and outputs the circumference
  * @author: Erick Meza
  */
  
  public void run() {
    
    // declare variables
    double dblRadius;
    double dblCircumference;

    // get radius input
    dblRadius = readDouble("Please enter the radius of circle: ");

    // calculate circumference
    dblCircumference = 2 * Math.PI * dblRadius;

    // output results
    System.out.println("The circumference of the circle with a radius of " + dblRadius + " is " + dblCircumference);
    
  }
}