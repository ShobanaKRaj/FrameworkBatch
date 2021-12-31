package org.testsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement s= driver.findElement(By.id("Credit2"));
		WebElement d=driver.findElement(By.id("bank"));
		WebElement d1=driver.findElement(By.id("Loan"));
		WebElement s1=driver.findElement(By.id("Credit1"));
		WebElement s2=driver.findElement(By.id("fourth"));
		WebElement d2=driver.findElement(By.id("amt8"));
		WebElement s3=driver.findElement(By.id("fourth"));
		WebElement d3=driver.findElement(By.id("amt7"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(s,d).perform();
		actions.dragAndDrop(s1,d1).perform();
		actions.dragAndDrop(s2,d2).perform();
		actions.dragAndDrop(s3,d3).perform();
		WebElement text = driver.findElement(By.xpath("//a[contains(text(),'Perfect')]"));
		String data = text.getText();
		System.out.println(data);
	}
}
