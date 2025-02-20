package BEWeekFiveCodingAssignment;

public class App {
	
	public static void main(String[] args) {
	
		Logger logger = new AsteriskLogger();
		logger.log("Oh Hi!");
		logger.error("Oh No!");
		
		Logger loggered = new SpacedLogger();
		loggered.log("Spaced Out");
		loggered.error("Something is wrong.");

	}

}
