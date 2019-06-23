package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setUp() 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		driver = new ChromeDriver(options);
	}
	
	
	@Test
	public void doLogin() 
	{
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("onwumerebright.nttdata@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
	}
	
	
	@AfterTest
	public void tearDown() 
	{
		driver.quit();
	}

}
