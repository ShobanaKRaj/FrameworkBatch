package org.testsel;

import java.io.IOException;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		
		
		
	}
}
