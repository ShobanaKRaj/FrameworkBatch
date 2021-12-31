package org.testsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:www.google.com");
		driver.manage().window().maximize();
		WebElement LnkGmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions action1 = new Actions(driver);
		action1.contextClick(LnkGmail).perform();
		
	}
}
