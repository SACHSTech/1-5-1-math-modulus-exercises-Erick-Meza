class Hours extends ConsoleProgram {

  /**
  * A program that converts an inputted number of hours into days and hours
  * @author: Erick M
  */
  
  public void run() {
    
    // initializes variables
    int intInputtedHours;
    int intDays;
    int intOutputtedHours;

    // prompts user for input
    intInputtedHours = readInt("Please enter a number of hours: ");

    // calculates the amount of days/hours
    intDays = intInputtedHours / 24;
    intOutputtedHours = intInputtedHours % 24;

    // outputs the results to the terminal
    System.out.println(intInputtedHours + " hrs is equivalent to " + intDays + " days and " + intOutputtedHours + " hrs");
    
  }
}