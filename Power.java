class Power extends ConsoleProgram {

  /**
  * A program that will ask the user for a base and an exponent and print out the result
  * @author: Erick M
  */
  
  public void run() {
    
    // declares variables
    double dblBase;
    double dblExponent;
    double dblResult;

    // prompts user for values
    dblBase = readDouble("Please enter a value for the base: ");
    dblExponent = readDouble("Please enter a value for the exponent: ");

    // calculates the operation
    dblResult = Math.pow(dblBase, dblExponent);

    // outputs the resulting value
    System.out.println("The resultant is " + dblResult);
    
    
  }
}