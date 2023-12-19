package com.main.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class base_class {
	
public static WebDriver driver;
public static Properties pc;
	@BeforeSuite

	public void loadproperties() throws IOException {
	
		String s = "C:\\Users\\Diwakar Agrawal\\eclipse-workspace\\minor_project\\src\\test\\resources\\config.properties";
		pc = new Properties();
		FileInputStream fis = new FileInputStream(s);
		pc.load(fis);
	}

public void browserLaunch()
{
	driver=new ChromeDriver();
}

public void openURL()
{
	driver.get(pc.getProperty("url"));
}
@AfterSuite
public void broswerclose()
{
	// driver.close();
}
}