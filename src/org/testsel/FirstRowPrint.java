package org.testsel;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstRowPrint {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement tabledata = driver.findElement(By.id("customers"));
		List<WebElement> allRows = tabledata.findElements(By.tagName("tr"));
		for (int i = 0; i <1 ; i++) {
			WebElement row = allRows.get(i);
			String text = row.getText();
			System.out.println(text);
		
		}
	}	
}
