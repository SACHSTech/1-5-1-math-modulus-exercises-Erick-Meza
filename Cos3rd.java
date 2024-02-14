class Cos3rd extends ConsoleProgram {

  /**
  * A program that will calculate the third side of a triangle from 2 inputted sides
  * @author: Erick M
  */
  
  public void run() {
    
    // declares variables
    double dblSide1;
    double dblSide2;
    double dblSide3;
    double dblAngle;

    // receives side inputs
    dblSide1 = readDouble("Please enter the lenght of one side: ");
    dblSide2 = readDouble("Please enter the length of the other sie: ");
    dblAngle = readDouble("Please enter an angle for the third side: ");

    // calculates the length of third side
    dblSide3 = Math.sqrt(Math.pow(dblSide1, 2) + Math.pow(dblSide2, 2) - 2 * (dblSide1) * (dblSide2) * Math.cos(dblAngle));

    // outputs the result
    System.out.println("The length of the third side is " + dblSide3);
    
  }
}