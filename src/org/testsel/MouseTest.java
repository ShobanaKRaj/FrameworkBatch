package org.testsel;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class MouseTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.t-mobile.com/");
		driver.manage().window().maximize();
		WebElement lnkPhone=driver.findElement(By.xpath("//a[text()=' Phones & devices ']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(lnkPhone).perform();
		WebElement gPhone=driver.findElement(By.xpath("//span[text()='5G phones']"));
		gPhone.click();
	}

}
