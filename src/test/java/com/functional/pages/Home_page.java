package com.functional.pages;

import org.openqa.selenium.By;

import com.main.base.base_class;

public class Home_page extends base_class{

	public void getXpathsheet()
	{
	driver.findElement(By.id("form_first_name_7")).sendKeys("Tester");
	driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("tester1@gmail.com");
	// driver.findElement(By.className("mailpoet_submit")).click();
	
}
	
	public void getHomePage()
	{
	driver.findElement(By.id("menu-item-43")).click();
}
	
	public void clickCheetSheet()
	{
		driver.findElement(By.className("mailpoet_submit")).click();
	}
}