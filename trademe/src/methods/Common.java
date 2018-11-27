package methods;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import objectrepository.homepage;

public class Common {
	
	public static WebDriver driver;
	
	public static void initialiseDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void openPage() {
		driver.get("https://www.trademe.co.nz/");
	}

	public static void searchString() {
		homepage.searchBar().sendKeys("Hello World");
		List<WebElement> e = homepage.searchCategory().getOptions();
		int cnt = e.size();
		for(int i = 0;i < cnt;i++)
		{
			String category = e.get(i).getText();
			try {
				homepage.searchCategory().selectByVisibleText(category);
			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
				homepage.searchCategory().selectByVisibleText(category);
			}
			homepage.btnSearch().click();			
		}
		
	}
}
