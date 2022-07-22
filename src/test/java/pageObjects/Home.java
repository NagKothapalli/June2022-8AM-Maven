package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import appUtilities.ApplicationUtilities;
import gUtilities.ReadProperties;

public class Home
{
	WebDriver driver; //null
	ApplicationUtilities appUtils;
	ReadProperties prop;
	public Home(WebDriver driver)
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		//driver = new ChromeDriver(); //3456
		this.driver = driver;
		appUtils = new ApplicationUtilities(driver);
		prop = new ReadProperties("TestData/DevData.properties");
	}
	public void navigateToHome()
	{
		System.out.println("RC : Navigate To Home Page");
		driver.findElement(By.xpath("//a[@title='Home']")).click();
	}
	public void bookTicket() 
	{
		System.out.println("RC : Book Bus Ticket");
		appUtils.mySendKeys("//input[@name='source']",prop.readData("FromCity"));			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appUtils.clickEnter();
		appUtils.mySendKeys("//input[@name='destination']",prop.readData("ToCity"));	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appUtils.clickEnter();
		appUtils.myClick("//input[@name='txtJourneyDate']");
		String jdate = prop.readData("JDate");
		appUtils.myClick("//a[text()='"+jdate+"']");
		appUtils.myClick("//input[@name='searchBtn']");
	}
	
	public void printTicket()
	{
		System.out.println("RC : Print Bus Ticket");
	}

}
