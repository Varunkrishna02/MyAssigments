package week2.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethodsAssignment {

	public static void main(String[] args) throws IOException {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		//getTitle of Page
		
		String pageTitle = driver.getTitle();
		System.out.println("PageTitle is "+pageTitle);
		
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		
		//snapshot
		
		/*
		 * File source1 = driver.getScreenshotAs(OutputType.FILE);
		 * 
		 * File des1=new File("./snap/name.png");
		 * 
		 * FileUtils.copyFile(source1, des1);
		 */
		
		
	     driver.close();
		
		
		
	
	
	}

}
