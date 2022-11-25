package week3.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement dropdown = driver.findElement(By.id("dropdown1"));
		
		//Get all options from Dropdown
		
		Select sec = new Select(dropdown);
		List<WebElement> options = sec.getOptions();
		System.out.println(options.size());
		
		System.out.println(options);
		
		for (WebElement each : options) {
			
			each.click();
			
		}

	}

}
