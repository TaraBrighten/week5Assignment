package BEWeekFiveCodingAssignment;

//Created a new class through File, New, Class
//Named new Class "SpacedLogger"
//Included "implements Logger" to pull in Logger Interface

public class SpacedLogger implements Logger{

//Logger overrides with 2 inherited methods: "log" and "error"	
//Named log of String "ohHi"
	@Override
	public void log(String ohHi) {

//Method prints input for String ohHi, using .replace to add a space in between each character 		
		System.out.println(ohHi.replace("", " "));
		
	}

//Method prints "ERROR: " and adds input for String ohNo using .replace to add a space in between each character 	
	@Override
	public void error(String ohNo) {
		System.out.println("ERROR: " +  ohNo.replace("", " "));
		
	}
	
}	
	
