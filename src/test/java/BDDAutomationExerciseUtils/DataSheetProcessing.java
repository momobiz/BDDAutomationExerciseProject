package BDDAutomationExerciseUtils;

public class DataSheetProcessing {
	
	public static String numberProcessing(String str) {
		int i;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)=='.') {
				break;
				
			}
		}
		
		return str.substring(0, i);
	}

}
