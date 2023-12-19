package com.test.cases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.functional.pages.Home_page;
import com.functional.pages.Login_page;
import com.main.base.base_class;
import com.main.base.listeners_class;

@Listeners(listeners_class.class)
public class Test_cases extends base_class
{
	Login_page lp;
	Home_page hp;
	
	@Test(enabled=false)
	 public void login()
	 {
		browserLaunch();
		openURL();
		
		lp=new Login_page();
		lp.enterUsername();
		lp.enterPassword();
		lp.clickSubmit();
		
	 }
	
@Test(priority=1)

public void login1() {
	browserLaunch();
	openURL();
	lp=new Login_page();
	lp.login();
}
 
@Test(priority=2)
public void getcheetsheet() throws InterruptedException
{
	
	hp=new Home_page();
	hp.getHomePage();
	hp.getXpathsheet();
	hp.clickCheetSheet();
	Thread.sleep(15000);
	hp.clickCheetSheet();
}
}
