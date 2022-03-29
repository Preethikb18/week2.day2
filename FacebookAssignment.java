package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Preethi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("KB");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("preethi.ischool@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("preethi.ischool@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Sannidhi18");
		
		WebElement dropDown1 = driver.findElement(By.id("day"));
		Select object1 =new Select(dropDown1);
		object1.selectByVisibleText("24");
		
		WebElement dropDown2 =driver.findElement(By.id("month"));
		Select object2 = new Select(dropDown2);
		object2.selectByVisibleText("Nov");
		
		WebElement dropDown3 =driver.findElement(By.id("year"));
		Select object3 =new Select(dropDown3);
		object3.selectByVisibleText("1984");
		
		//driver.findElement(By.xpath("//input[@name='sex']")).sendKeys("Female");
		driver.findElement(By.name("sex")).click();
		
		
		
		
		
	}

}
