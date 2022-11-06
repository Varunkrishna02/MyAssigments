package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssigmnetsSecond {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		    
		    driver.get("http://leaftaps.com/opentaps/control/main");
		    
		    driver.manage().window().maximize();
	        driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Democsr2");   
	        driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
	        
	        driver.findElement(By.xpath("//input[@class='decorativeSubmit']//parent::p")).click();
	        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]/parent::div")).click();
	        
	        
	        
	        driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	        
	        driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
	        
	        driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Test123");
	        
	        String pageTitle=driver.getTitle();
	        System.out.println("PageTitle of page is "+ pageTitle);
	        
	        driver.close();
	        

	}

}
