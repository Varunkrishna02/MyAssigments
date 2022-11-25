package week3.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkCount {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
	    System.out.println("Total Links "+size);
	    
	    //getting values of firstLink
	    
	    WebElement secondLink = links.get(1);
	    String text = secondLink.getText();
	    System.out.println(text);

	}

}
