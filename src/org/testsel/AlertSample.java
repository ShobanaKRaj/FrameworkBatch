package org.testsel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement s = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		s.click();
		Thread.sleep(3000);
		WebElement n = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		n.click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.sendKeys("Priya");
		a.accept();
		WebElement text = driver.findElement(By.xpath("//p[text()='Hello Priya How are you today']"));
		String z = text.getText();
		System.out.println(z);
		
		
		
	}

}
