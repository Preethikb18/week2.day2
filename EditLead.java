package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
           WebDriverManager.chromedriver().setup();
            ChromeDriver driver =new ChromeDriver();
            driver.get("http://leaftaps.com/opentaps/control/main");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.findElement(By.id("username")).sendKeys("demosalesmanager");
    		driver.findElement(By.id("password")).sendKeys("crmsfa");
    		driver.findElement(By.className("decorativeSubmit")).click();
    		driver.findElement(By.linkText("CRM/SFA")).click();
    		driver.findElement(By.linkText("Leads")).click();
    		driver.findElement(By.linkText("Find Leads")).click();
    		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Preethi");
    		driver.findElement(By.linkText("Leads")).click();
    		driver.findElement(By.linkText("Find Leads")).click();
    		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
    		System.out.println(driver.getTitle());
    		driver.findElement(By.xpath("//a[text()='Edit']")).click();
    		driver.findElement(By.id("updateLeadForm_companyName")).clear();
    		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf Industries");
    		driver.findElement(By.xpath("//input[@value='Update']")).click();
    		WebElement name = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
    		if(name.isDisplayed())
    			System.out.println("Is Displayed");
    		else
    			System.out.println("Not Displayed");
    		driver.close();
    		

    	

	

}
}