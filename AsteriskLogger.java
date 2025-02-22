package BEWeekFiveCodingAssignment;

//Created a new class through File, New, Class
//Named new Class "AsteriskLogger"
//Included "implements Logger" to pull in Logger Interface

public class AsteriskLogger implements Logger{

//Logger overrides with 2 inherited methods: "log" and "error"	
//Named log of String "ohHi"
	@Override
	public void log(String ohHi) {

//When method runs, console prints string ohHi with asterisks before and after		
		System.out.println("***" + ohHi + "***");
		
	}
//Named error of String "ohNo"
	@Override
	public void error(String ohNo) {

//When method runs, the console prints a line of asterisks on top,
//a line that says "***Error: " adds the string ohNo and ends "***"
//The line below the string is all asterisks
		
		System.out.println("********************");
		System.out.println("***Error: " + ohNo + "***");
		System.out.println("********************");		
		
	}

}













//public class AsteriskLogger {

//	public static void main(String[] args) {
		
//		Logger logger = new ConsoleLogger();

//				String ohHi = "Oh Hi";
//				String ohNo = "Oh No!";

//		logger.log("***" + ohHi + "***");
		
		
//		System.out.println("********************");
//		logger.error("*** Error: " + ohNo + "***");
//		System.out.println("********************");
		
//	}
	

//}
