package org.testsel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class PrintOrderId {

public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com/index.php");
			driver.manage().window().maximize();
			WebElement txtUserName = driver.findElement(By.id("username"));
			txtUserName.sendKeys("Preethikraj");
			WebElement txtPassword = driver.findElement(By.id("password"));
			txtPassword.sendKeys("Hello@143");
			WebElement btnlogin = driver.findElement(By.id("login"));
			btnlogin.click();
			WebElement location = driver.findElement(By.id("location"));
			Select s = new Select(location);
			s.selectByIndex(1);
			WebElement hotel = driver.findElement(By.id("hotels"));
			Select e = new Select(hotel);
			e.selectByIndex(1);
			WebElement roomtype = driver.findElement(By.id("room_type"));
			Select l = new Select(roomtype);
			l.selectByIndex(2);
			WebElement roomno = driver.findElement(By.id("room_nos"));
			Select c = new Select(roomno);
			c.selectByIndex(2);
			//WebElement checkindate = driver.findElement(By.id("datepick_in"));
			//checkindate.sendKeys("23/12/2021");
			//WebElement checkoutdate = driver.findElement(By.id("datepick_out"));
			//checkoutdate.sendKeys("23/12/2021");
			WebElement adult = driver.findElement(By.id("adult_room"));
			Select t = new Select(adult);
			t.selectByIndex(2);
			WebElement child = driver.findElement(By.id("child_room"));
			Select a = new Select(child);
			a.selectByIndex(1);
			WebElement search = driver.findElement(By.id("Submit"));
			search.click();
			WebElement clickbtn = driver.findElement(By.id("radiobutton_0"));
			clickbtn.click();
			WebElement continuebtn = driver.findElement(By.id("continue"));
			continuebtn.click();
			WebElement firstname = driver.findElement(By.id("first_name"));
			firstname.sendKeys("Preethi");
			WebElement lastname = driver.findElement(By.id("last_name"));
			lastname.sendKeys("Kraj");
			WebElement address = driver.findElement(By.id("address"));
			address.sendKeys("Thoraipakkam, Chennai");
			WebElement ccno = driver.findElement(By.id("cc_num"));
			ccno.sendKeys("1234567812345648");
			WebElement cctype = driver.findElement(By.id("cc_type"));
			Select cct = new Select(cctype);
			cct.selectByIndex(2);
			WebElement month = driver.findElement(By.id("cc_exp_month"));
			Select mon = new Select(month);
			mon.selectByIndex(2);
			WebElement year = driver.findElement(By.id("cc_exp_year"));
			Select yr = new Select(year);
			yr.selectByIndex(2);
			WebElement CVV = driver.findElement(By.id("cc_cvv"));
			CVV.sendKeys("123");
			WebElement booknow = driver.findElement(By.id("book_now"));
			booknow.click();
			Thread.sleep(5000);
			WebElement element = driver.findElement(By.id("order_no"));
			String data = element.getAttribute("value");
			System.out.println(data);
			
			
			
		}
}