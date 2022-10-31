package wek2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {

      WebDriverManager.chromedriver().setup();
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://en-gb.facebook.com/");
      
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      
      
      driver.findElement(By.partialLinkText("New Account")).click();
      
      driver.findElement(By.name("firstname")).sendKeys("Test123");
      driver.findElement(By.name("lastname")).sendKeys("Test123");
      driver.findElement(By.name("reg_email__")).sendKeys("859632145");
      driver.findElement(By.name("reg_passwd__")).sendKeys("Admin123");
      
      WebElement SelectDay = driver.findElement(By.id("day"));
      Select obj=new Select(SelectDay);
      obj.selectByValue("11");
      
      WebElement SelectMonth = driver.findElement(By.id("month"));
      Select obj1=new Select(SelectMonth);
      obj1.selectByVisibleText("Apr");
      
      WebElement SelectYear = driver.findElement(By.id("year"));
      Select obj2=new Select(SelectYear);
      obj2.selectByIndex(3);
      
      
	}

}
