package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Preethi");
		driver.findElement(By.id("lastNameField")).sendKeys("KB")	;	
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Preethib");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Preethik");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Selenium is intresting");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("preethu.ischool@gmail.com");
		
		WebElement dropDown= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		
		Select object = new Select(dropDown);
		object.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("It is new importance notice");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    System.out.println(driver.getTitle());
		
		
		
		//driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("KB");
	}

}
