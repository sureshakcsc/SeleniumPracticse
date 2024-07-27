package seleniumRefreshMar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterTextboxExample {

	
		// TODO Auto-generated method stub
	@Test
	public void textBoxEnter()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(option);
		
		driver.get("https://www.leafground.com/dashboard.xhtml");
	WebElement ele=	driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']"));
	ele.click();
		

	}

}
