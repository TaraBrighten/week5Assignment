package BEWeekFiveCodingAssignment;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String ohHi) {
	
		System.out.println("***" + ohHi + "***");
		
	}

	@Override
	public void error(String ohNo) {
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
