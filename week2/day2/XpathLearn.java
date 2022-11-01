package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLearn {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("Democsr2");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		//Xpath -Partial text based 
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		//Xpath - Textbased
		driver.findElement(By.xpath("//a[text()='Leads']")).click();		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//Xpath - Attribute Based
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test123");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Leaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("abcd");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

	}

}
