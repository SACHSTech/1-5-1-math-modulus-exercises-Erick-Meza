class AreaSin extends ConsoleProgram {

  /**
  * A program that calculates the area of a triangle using 2 inputted lengths and 1 inputted angle
  * @author: Erick M
  */
  
  public void run() {
    
    // declares variables
    double dblSide1;
    double dblSide2;
    double dblAngle;
    double dblArea;

    // receives input from user
    dblSide1 = readDouble("Please enter the length of side 1: ");
    dblSide2 = readDouble("Please enter the length for side 2: ");
    dblAngle = readDouble("Please enter the angle of side 3: ");

    // calculates the area of the triangle
    dblArea = (dblSide1 * dblSide2 * Math.sin(dblAngle)) / 2;

    // outputs the resultant area
    System.out.println("The area of the triangle with side lengths of " + dblSide1 + " and " + dblSide2 + " with an angle of " + dblAngle + " is " + dblArea);
    
    
  }
}