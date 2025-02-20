package BEWeekFiveCodingAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void log(String ohHi) {
		
		System.out.println(ohHi.replace("", " "));
		
	}

	@Override
	public void error(String ohNo) {
		System.out.println("ERROR: " +  ohNo.replace("", " "));
		
	}
	
}	
	
//    public static String addSpaces(String text) {
  //      if (text == null || text.isEmpty()) {
    //        return "";
      //  }
        //StringBuilder result = new StringBuilder();
//        for (int i = 0; i < text.length(); i++) {
  //          result.append(text.charAt(i));
    //        if (i < text.length() - 1) {
      //          result.append(" ");
        //    }
//        }
  //      return result.toString();
    //}
	//
//	public static void main(String[] args) {
	//	
		//Logger logger = new ConsoleLogger();
//
	//			String ohHi = "OH HI";
		//		String spacedString = addSpaces(ohHi);
			//	String ohNo = "ERROR: OH NO!";
				//String spacedString2 = addSpaces(ohNo);
//
	//			logger.log(spacedString);
		
		
		//logger.error(spacedString2);
				
	//}


	
//}
