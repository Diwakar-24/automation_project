package com.functional.pages;

import org.openqa.selenium.By;

import com.main.base.base_class;

public class Login_page extends base_class {
	

         public void enterUsername()
         {
        	 driver.findElement(By.id("username")).sendKeys(pc.getProperty("username"));
         }
         
         public void enterPassword()
         {
        	 driver.findElement(By.id("password")).sendKeys(pc.getProperty("password"));
         }
         
         public void clickSubmit()
         {
        	 driver.findElement(By.id("submit")).click();
         }
         
         public void login()
         {
        	 driver.findElement(By.id("username")).sendKeys(pc.getProperty("username"));
         driver.findElement(By.id("password")).sendKeys(pc.getProperty("password"));
    	 driver.findElement(By.id("submit")).click();
}
}
