package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.DynamicControlsPage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DynamicControlsSteps extends Base{
	
	DynamicControlsPage  dynamicControlPage;
	
	@Given("^user is on Dynamic Controls page$")
	public void user_is_on_Dynamic_Controls_page() throws Throwable {
		getdriver();
		dynamicControlPage=PageFactory.initElements(driver, DynamicControlsPage.class);
		
		dynamicControlPage.clickDynamicControls();
	}

	@When("^user clicks on Remove button$")
	public void user_clicks_on_Remove_button() throws Throwable {
		dynamicControlPage.clickRemoveButton();
	}

	@Then("^user able to delete Remove button successfully$")
	public void user_able_to_delete_Remove_button_successfully() throws Throwable {
		
		
		Assert.assertEquals("It's gone!",dynamicControlPage.removeButtonMessage());
		
		driver.quit();
	}


}
