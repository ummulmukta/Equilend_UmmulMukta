package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {
	public WebDriver driver;
	public DynamicControlsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Dynamic Controls')]")
	public WebElement  dynamicControls;
	public WebElement clickDynamicControls() {
		dynamicControls.click();
		return dynamicControls;
		
	}
	@FindBy(xpath="//button[contains(text(),'Remove')]")
	public WebElement  removeButton;
	public WebElement clickRemoveButton() {
		removeButton.click();
		return removeButton;
		
	}
	
	@FindBy(xpath="//p[@id='message']")
	public WebElement  removeButtonText;
	public String  removeButtonMessage() {
	return	removeButtonText.getText();
		//System.out.println(removeButtonText.getText());
		
	}
	
}
