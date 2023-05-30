package Login;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BT_login {
	public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "/home/thai.thi.van.anh/Desktop/Autotest/chromedriver_linux64/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com/");
	
	
	driver.close();
}}
