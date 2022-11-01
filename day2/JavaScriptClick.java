package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptClick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        
		//Xpath - Attribute based
		
		driver.findElement(By.id("username")).sendKeys("Democsr2");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		//Xpath -Partial text based 
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

		
		
		WebElement Leads= driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[2]"));
		driver.executeScript("arguments[0].click()", Leads);
	}

}
