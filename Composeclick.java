package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Composeclick {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverWait w;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32.zip\\chromedriver.exe");
		
		@Given("^I need to login to gmail site with valid credentials$")
		final void login() {
			driver=new ChromeDriver();
			driver.get("https://accounts.google.com/");
			driver.findElement(By.id("identifierId")).sendKeys("testdummy081930");
			driver.findElement(By.className("VfPpkd-RLmnJb")).click();
			driver.findElement(By.name("password")).sendKeys("Test@1234");
			driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		
		}
		
		@Then("compose button is displayed")
		final String compose() {
			WebElement e=driver.findElement(By.xpath("//*[text()='Compose']"));
			if(e.isDisplayed()) {
				System.out.println("Pass");
			}
		}
	}

}
