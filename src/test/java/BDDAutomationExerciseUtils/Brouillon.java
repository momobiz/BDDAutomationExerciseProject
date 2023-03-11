package BDDAutomationExerciseUtils;

import org.apache.poi.util.SystemOutLogger;

public class Brouillon {

	public static void main(String[] args) {
		String str="1235.0";
		int i;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)=='.') {
				break;
				
			}
		}
		System.out.println(str.substring(0, i));
		

	}

}
