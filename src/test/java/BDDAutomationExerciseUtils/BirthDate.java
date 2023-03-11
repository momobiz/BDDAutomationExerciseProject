package BDDAutomationExerciseUtils;

import java.util.regex.Pattern;

public class BirthDate {
	
	static final Pattern p=Pattern.compile("[-\\/,;_\\\\+*]");
	String[] elementsOfBirthDate;
	String[] months= {"janvier","février","mars","avril","mai","juin","juillet","août","septembre",
			"octobre","novembre","décembre"};
	
	public BirthDate(String DateOfBirth) {
		elementsOfBirthDate=p.split(DateOfBirth);
	}
	
	public String generateDayOfBirth() {
		String day=elementsOfBirthDate[0];
		if(day.charAt(0)=='0') {
			day=day.substring(1);
		}
		return day;
		
	}
	public String generateMonthOfBirth() {
		String monthOfBirth=elementsOfBirthDate[1];
		String monthOfBirth1=monthOfBirth.substring(0, monthOfBirth.length()-1);
		
		int index=1;
		for(String month:months) {
			if(month.contains(monthOfBirth1)) {
				
				break;
				
			}else {
				index++;
			}
			
			
		}
		return String.valueOf(index);
	}
	
	public String generateYearOfBirth() {
		return elementsOfBirthDate[2];
	}
	

}
