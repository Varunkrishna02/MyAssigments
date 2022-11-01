package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateEditCompanyName {

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
		
		//Index/ Collection based xPath:(//tagName)[index]
		//tagName[@attribute='attributeValue'])[index]
		//(//tagName[text()='textValue'])[index]
		
		driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[2]")).click();
		
		//Xpath - Textbased
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//Xpath - Attribute Based
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test123");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Leaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("abcd");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		
		String secondName="EditedName";
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(secondName);
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//Verifying Updated name
		
		WebElement UpdatedName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
	    String editedName = UpdatedName.getText();
	
		
		if(editedName.contains(secondName))
		{
		System.out.println("CompanyName is Updated successfully");
		}
		else
		{
			System.out.println("CompanyName is not Updated successfully");
		}
		
		

	}

}
