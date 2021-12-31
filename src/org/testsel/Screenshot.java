package org.testsel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/markets/fno-market-snapshot");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.className("leftD"));
		File s = element.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\dell\\Desktop\\Selenium\\Sample.png");
		FileUtils.copyFile(s, f);
		
	
	}

}
