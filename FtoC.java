class FtoC extends ConsoleProgram {

  /**
  * A program that converst an inputted temperature in fahrenheit into degrees celsius
  * @author: Erick M
  */
  
  public void run() {
    
    // declares variables
    double dblTempFahrenheit;
    double dblTempCelsius;

    // receives input from terminal
    dblTempFahrenheit = readDouble("Please enter a temperature in Fahrenheit: ");

    // computes the mathematical operation
    dblTempCelsius = (5.0/9.0) * (dblTempFahrenheit - 32.0);

    // outputs the resultant temperature
    System.out.println("The temperature in degrees celsius is " + dblTempCelsius);
    
  }
}