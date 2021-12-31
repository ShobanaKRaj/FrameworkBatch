package org.testsel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SampleSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Preethi");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Priya@143");
		WebElement btnlogin = driver.findElement(By.xpath("//button[@value='1']"));
		btnlogin.click();
	}
}