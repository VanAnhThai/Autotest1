package BaitapShop;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//import util.VariableSettings;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndCart {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"/home/thai.thi.van.anh/Desktop/Autotest/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.navigate().to("https://shop.demoqa.com/");
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(4000);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(4000);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(4000);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(4000);

//  ---------- Register ----------
		driver.findElement(By.linkText("My Account")).click();

//  ---------- Login ----------
//
		driver.findElement(By.id("username")).sendKeys("thai.thi.van.anh@sun-asterisk.com");
		driver.findElement(By.id("password")).sendKeys("@thaithivananh1234567891");
		driver.findElement(By.xpath("//*[@name='login']")).click();

//  ---------- Cart ----------

		driver.findElement(By.className("custom-logo")).click();

		driver.findElement(By.className("second-img")).click();

//  ---------- Scroll ----------
		WebElement selectColor = driver.findElement(By.xpath(
				"//*[@name='attribute_pa_color']"));
		Select selectSL = new Select(selectColor);
		selectColor.click();
		selectSL.selectByIndex(1);

//  ---------- Select Size ----------

		WebElement selectSize = driver.findElement(By.xpath(
				"///*[@name='attribute_pa_size']"));
		Select selectSizes = new Select(selectSize);
		selectSize.click();
		selectSizes.selectByIndex(2);
		Thread.sleep(4000);	

//  ---------- Logout ----------

		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(4000);

	}
}
