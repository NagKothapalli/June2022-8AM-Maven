package pageObjects;

import org.openqa.selenium.WebDriver;

public class CancelTicket
{
	WebDriver driver; //null
	public CancelTicket(WebDriver driver)
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		//driver = new ChromeDriver(); //3456
		this.driver = driver;
	}
	public void navigateToCancelTicket()
	{
		System.out.println("RC : NavigateToCancelTicket");
	}
	
	public void cancelBusTicket()
	{
		System.out.println("RC : Cancel Bus Ticket");
	}

}
