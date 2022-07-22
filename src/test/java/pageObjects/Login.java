package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
	WebDriver driver; //null
	public Login(WebDriver driver)//1234
	{
		System.out.println("Login page object ran");
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		//driver = new ChromeDriver(); //2345
		this.driver = driver; //a = a  //1234
	}
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		driver.get("https://www.apsrtconline.in/");
	}
	public void loginToApplication()
	{
		System.out.println("RC : Login To Application");
	}
	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}
	public void closeApplication()
	{
		System.out.println("RC : Close Application");
	}
	

}
