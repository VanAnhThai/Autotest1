package Login;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import util.VariableSettings;

public class Textbox {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/home/thai.thi.van.anh/Desktop/Autotest/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		// WSM
//		String baseUrl = "https://wsm.sun-asterisk.vn/vi#";
//		String email = "thai.thi.van.anh@sun-asterisk.com";
//		String password = "123456";
//
//		driver.get(baseUrl);
//
//		WebElement btnLogin = driver
//				.findElement(By.cssSelector("body > div.wsm-index > div.slide-wsm-content.display-none > a"));
//		btnLogin.click();
//
//		WebElement emailElement = driver.findElement(By.id("user_email"));
//		WebElement passwordElement = driver.findElement(By.id("user_password"));
//
//		emailElement.sendKeys(email);
//		passwordElement.sendKeys(password);
//
//		driver.findElement(By.className("span-remember")).click();
//
//		WebElement btnSubmitLogin = driver.findElement(By.className("login-success"));
//		btnSubmitLogin.click();
//
//		driver.findElement(By.className("fa fa-window-close")).click();

//		String baseUrl = "https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html";
//			String firstname = "anh";
//		String lastname = "thai";
//		driver.get(baseUrl);

//  ---------- 1. TEXTBOX ----------

		WebElement btnLogin = driver.findElement(By.cssSelector(
				"#post-body-7988417473080013803 > div:nth-child(4) > center > form:nth-child(13) > input[type=submit]:nth-child(8)"));
		btnLogin.click();

		WebElement firstnameElement = driver.findElement(By.name("firstname"));
		firstnameElement.sendKeys("anh");
		WebElement lastnameElement = driver.findElement(By.name("lastname"));
		lastnameElement.sendKeys("thai");

// ---------- 2. RADIO-BUTTON ----------

		WebElement btnRadio = driver.findElement(By.cssSelector(
				"#post-body-7988417473080013803 > div:nth-child(4) > center > input[type=radio]:nth-child(22)"));
		btnRadio.click();

		WebElement NoElement = driver.findElement(By.name("No"));
		NoElement.click();

//	---------- 3. CHECKBOX ----------

		driver.findElement(By.cssSelector(
				"#post-body-7988417473080013803 > div:nth-child(4) > center > input[type=checkbox]:nth-child(30)"))
				.click();
		driver.findElement(By.cssSelector(
				"#post-body-7988417473080013803 > div:nth-child(4) > center > input[type=checkbox]:nth-child(32)"))
				.click();
		driver.findElement(By.cssSelector(
				"#post-body-7988417473080013803 > div:nth-child(4) > center > input[type=checkbox]:nth-child(34)"))
				.click();
		driver.findElement(By.cssSelector(
				"#post-body-7988417473080013803 > div:nth-child(4) > center > input[type=checkbox]:nth-child(36)"))
				.click();

//  ---------- 4. DROPDOWN ----------

		WebElement selectElement = driver
				.findElement(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/form[3]/select"));
		Select testSelect = new Select(selectElement);
		selectElement.click();
		testSelect.selectByIndex(2);

//  ---------- 5. LINK ----------
		String baseUrl = "https://vnexpress.net/";

		driver.get(baseUrl);
		driver.findElement(By.linkText(
				"Tương quan trước trận Việt Nam - Myanmar"))
				.click();
		System.out.println("Title of page is: " + driver.getTitle());

//  ---------- 6. XPath ----------
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		WebElement elements = driver.findElement(By.xpath("//input[@name='uid']"));
		System.out.println("test");

		
		
	
	}
}
