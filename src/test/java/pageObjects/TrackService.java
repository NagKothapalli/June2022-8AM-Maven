package pageObjects;

import org.openqa.selenium.WebDriver;

public class TrackService
{
	WebDriver driver; //null
	public TrackService(WebDriver driver)
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		//driver = new ChromeDriver(); //3456
		this.driver = driver;
	}
	public void navigateToTrackService()
	{
		System.out.println("RC : NavigateToTrackService");
	}
	
	public void trackTheBusService()
	{
		System.out.println("RC : TrackTheBusService");
	}
}
