package org.testsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testdebug {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		driver.manage().window().maximize();
		WebElement btnCreateNwAct = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnCreateNwAct.click();
		Thread.sleep(3000);
		WebElement txtFirstName = driver.findElement(By.name("firstname"));
		txtFirstName.sendKeys("Preethi");
		
	}

}
