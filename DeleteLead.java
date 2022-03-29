package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneAreaCode")).sendKeys("000");
		driver.findElement(By.name("phoneNumber")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
        WebElement leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]//a"));
    	String leadid2 = leadID.getText();
    	System.out.println("The leadid is"+" "+leadid2);
    	leadID.click();
    	driver.findElement(By.xpath("//a[text()='Delete']")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.partialLinkText("Find Leads")).click();
    	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid2);
    	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

    	if(driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed())
    	{
    		System.out.println("duplicate name does not exists");
    	}
    	else
    	{
    		System.out.println("Duplicate name exits");
    	}
    	driver.close();

		

	}

}
