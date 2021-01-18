package stepDefinitions;

import PageFactory.Base;
import io.cucumber.java.After;

public class Hooks extends Base{
	
	@After
	public void aftertest() {
		
		driver.close();
	}

}
