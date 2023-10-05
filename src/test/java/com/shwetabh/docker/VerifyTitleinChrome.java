package com.shwetabh.docker;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class VerifyTitleinChrome {
	static WebDriver driver;
	@BeforeClass
	public void setup() throws MalformedURLException
	{
		System.out.println("Running test in docker ");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void aajtakSearch() throws InterruptedException
	{	
		driver.navigate().to("https://www.aaaaajtak.in/");
		System.out.println("Title of page is "+driver.getTitle());
		Thread.sleep(2000);
	}
	@AfterClass
	public void teardown() throws InterruptedException
	{
		driver.quit();
		Thread.sleep(2000);
	}
}