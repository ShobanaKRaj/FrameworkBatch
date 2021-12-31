package org.testsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.greenstech.in/selenium-course-content.html");
			driver.manage().window().maximize();
			WebElement overview = driver.findElement(By.xpath("//p[contains(text(),'Greens Technologies Selenium')]"));
			String data = overview.getText();
			System .out.println(data);
			driver.quit();
		}
}
