package objectrepository;




import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class homepage {
	
	public static WebDriver driver = methods.Common.driver;
	public static WebElement element;

	public static WebElement searchBar() {
		element = driver.findElement(By.id("searchString"));
		return element;
	}
	
	public static Select searchCategory() {
			Select element = new Select(driver.findElement(By.id("SearchType")));
			return element;
	}
	
	public static WebElement btnSearch() {
			element = driver.findElement(By.xpath("//span[@class='icon-search-large']"));
			return element;
	}
}
