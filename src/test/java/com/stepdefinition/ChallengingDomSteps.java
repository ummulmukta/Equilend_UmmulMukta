package com.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.ChallengingDomPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChallengingDomSteps extends Base {
	ChallengingDomPage challengingDomPage;
	ArrayList<String> initialButtonContents;
	ArrayList<String> FinalButtonContents;

	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		getdriver();
		challengingDomPage = PageFactory.initElements(driver, ChallengingDomPage.class);
	}

	@When("^user clicks on Challenging Dom button$")
	public void user_clicks_on_Challenging_Dom_button() throws Throwable {
		challengingDomPage.clickchallengingDom();
	}

	@Then("^user able to go Challenging Dom page successfully$")
	public void user_able_to_go_Challenging_Dom_page_successfully() throws Throwable {

		Assert.assertEquals("https://the-internet.herokuapp.com/challenging_dom", driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(3000);

	}

	@When("^user click red button$")
	public void user_click_red_button() throws Throwable {

		initialButtonContents = challengingDomPage.getAllButtonsContents();
		System.out.println(initialButtonContents);
		challengingDomPage.clickRedButton();
		Thread.sleep(2000);

		FinalButtonContents = challengingDomPage.getAllButtonsContents();

		System.out.println(FinalButtonContents);

	}

	@Then("^blue red and green button id change$")
	public void blue_red_and_green_button_id_change() throws Throwable {

		System.out.println(challengingDomPage.ifDifferent(initialButtonContents, FinalButtonContents));
		driver.quit();
	}

}
