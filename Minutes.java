class Minutes extends ConsoleProgram {

  /**
  * A program that converts inputted minutes into days, hours, and minutes
  * @author: Erick M
  */
  
  public void run() {
    
    // declares variables
    int intInputtedMinutes;
    int intDays;
    int intHours;
    int intOutputtedMinutes;

    // prompts user for input in minutes
    intInputtedMinutes = readInt("Please enter a number of minutes: ");

    // calculates the amount of days, hours, and minutes
    intDays = intInputtedMinutes / 1440;
    intHours = (intInputtedMinutes % 1440) / 60;
    intOutputtedMinutes = intInputtedMinutes % 60;

    // outputs the result
    System.out.println(intInputtedMinutes + " minutes is equivalent to " + intDays + " days " + intHours + " hours and " + intOutputtedMinutes + " minutes");
    
  }
}