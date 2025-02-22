package BEWeekFiveCodingAssignment;

//Created a new class through File, New, Class
//Named new class "App"
public class App {

//Created a main method that runs through an array of String with arguments from consoles	
	public static void main(String[] args) {

//App runs the AsteriskLogger console		
		Logger logger = new AsteriskLogger();

//String for log is "Oh Hi!" which will print with asterisks before nad after		
		logger.log("Oh Hi!");
		
//String for error is "Oh No!" which will print with asterisks above and below, and ***Error: O h N o*** in the middle	
		logger.error("Oh No!");

//App runs the SpacedLogger console		
		Logger loggered = new SpacedLogger();

//String for log "Spaced Out" prints as "S p a c e d  O u t"		
		loggered.log("Spaced Out");

//String for error prints as "ERROR: " then "Something is wrong." with spaces between each character	
		loggered.error("Something is wrong.");

	}

}
