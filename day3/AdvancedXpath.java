package week2.day3;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvancedXpath {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
		//1.Parent to ChildXpath
		//Syntax || Xpath for parent/Child tagname
		
        driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Democsr2");
        

        
        
	
		//3.GrandParent to GrandChild Xpath
		//Syntax || Xpath for Grandparent//GrandChild tagname
        
        driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
        
		//2.Child to Parent Xpath
		//Syntax || Xpath for Child/parent::Parenttagname (Scope operator ::)
        
        driver.findElement(By.xpath("//input[@class='decorativeSubmit']//parent::p")).click();
       
        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]/parent::div")).click();
       
	
		//4.GrandChild to GrandParent Xpath
		//Syntax || Xpath for GrandChild xpath/ancestor::GrandParenttagname (Scope operator ::)
        
       
        driver.findElement(By.xpath("(//a[text()='Leads']/ancestor::div)[4]")).click();
         
        driver.findElement(By.xpath("//a[text()='Create Lead']/parent::li")).click();
   
	
		//5.ElderSibling  to youngerSibling Xpath     
		//Syntax || Xpath for ElderSibling/following sibling :: YoungerSiblingTagName
		
		
		//6.YoungerSibling  to ElderSibling Xpath
		//Syntax || Xpath for YoungerSibling/Preceding sibling :: ElderSiblingTagName
		
		
		
		
		
	}

}
