package com.capg.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {

	WebDriver driver;
	

@Given("^Navigate to Flipkart$")
public void navigate_to_Flipkart() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "G:/BDD_BOOTCAMP/chromedriver.exe");
	
	
		driver =  new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
	
    
}

@When("^User Enters Valid Credentials$")
public void user_Enters_Valid_Credentials() throws Throwable {
   
}

@Then("^Display Home Page$")
public void display_Home_Page() throws Throwable {
    
}


	
	
}
