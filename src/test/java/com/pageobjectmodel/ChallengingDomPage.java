package com.pageobjectmodel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChallengingDomPage {
	public WebDriver driver;
	public ChallengingDomPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Challenging DOM')]")
	public WebElement  challengingDom;
	public WebElement clickchallengingDom() {
		challengingDom.click();
		return challengingDom;
		
	}
	@FindBy(xpath="//a[@class='button alert']")
	public WebElement  redButton;
	public void clickRedButton() {
		redButton.click();
		
		
	}

@FindBy(xpath="//a[@class='button']")
public WebElement  blueButton;


@FindBy(xpath="//a[@class='button success']")
public WebElement  greenButton;


public ArrayList getAllButtonsContents() {
	
	ArrayList<String> ButtonContents = new ArrayList<>();
	
	ButtonContents.add(blueButton.getText());
	ButtonContents.add(redButton.getText());
	ButtonContents.add(greenButton.getText());
	
	return ButtonContents;
	
}

public boolean ifDifferent(ArrayList<String> initialContents,ArrayList<String> finalContents) {
	boolean result=true;
	for(int a=0;a<initialContents.size();a++) {
	
		
		
		if(initialContents.get(a)==finalContents.get(a)) {
			result= false;
			break;}
		
		
	}
	
	return result;
	
	
}
}


