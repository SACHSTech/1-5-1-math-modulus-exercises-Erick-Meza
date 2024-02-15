class Km_to_Miles extends ConsoleProgram {

  /**
  * A program that will convert inputted measurement in kilometers into miles
  * @author: Erick M
  */
  
  public void run() {
    
    // declares variables
    double dblKmMeasurement;
    double dblMilesMeasurement;

    // prompts user for measurement
    dblKmMeasurement = readDouble("Please enter a measurement in km: ");

    // mathematically converts the measurement into miles
    dblMilesMeasurement = dblKmMeasurement * 0.621371;

    // outputs the converted measurement
    System.out.println(dblKmMeasurement + " km " + "in miles is " + dblMilesMeasurement + " mi");
    
  }
}