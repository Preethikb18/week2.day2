package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("preethi.ischool@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Preethi",Keys.TAB);
		Thread.sleep(1000);
		String defaultText = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");//Getting value inside field entered
	    System.out.println(defaultText);
	    driver.findElement(By.xpath("//input[@name='username']")).clear();
	    WebElement element1 = driver.findElement(By.xpath("//label[contains(text(),'disabled')]/following-sibling::input"));
		System.out.println(element1.isEnabled());
		
		
		
	}

}
