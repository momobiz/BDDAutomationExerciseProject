package BDDAutomationExerciseStep;
import BDDAutomationExercisePage.BasePage;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends BaseStep {
	
	@Before
	public void initialisation() {	
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) {
		byte[] screenshot=BasePage.takeScreenshot();
		scenario.attach(screenshot, "image/png", "image");
		
		
	}
	@After
	public void quitdriver(){
//		BasePage.quitDriver();
		
		
	}
	
	

}
