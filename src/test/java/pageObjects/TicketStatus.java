package pageObjects;

import org.openqa.selenium.WebDriver;

public class TicketStatus
{
	WebDriver driver; //null
	public TicketStatus(WebDriver driver)
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		//driver = new ChromeDriver(); //3456
		this.driver = driver;
	}
	public void navigateToTicketStatus()
	{
		System.out.println("RC : NavigateToTicketStatus");
	}
	
	public void checkBusTicketStatus()
	{
		System.out.println("RC : CheckBusTicketStatus");
	}

}
