package tCases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pageObjects.CancelTicket;
import pageObjects.Home;
import pageObjects.Login;
import pageObjects.TicketStatus;
import pageObjects.TrackService;

public class TestCases //extends Login
{
	WebDriver driver;
	Actions actions;
	Login login ;
	Home home ;
	CancelTicket cancelTicket ;
	TrackService trackService ;
	TicketStatus ticketStatus;
	public TestCases()
	{
		System.out.println("Test Cases constructor");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //1234
		login = new Login(driver); //1234
		home = new Home(driver); //1234
		cancelTicket = new CancelTicket(driver); //1234
		trackService = new TrackService(driver); //1234
		ticketStatus = new TicketStatus(driver); //1234
	}
	@Test
	public void bookBusTicketAndPrint()
	{
		System.out.println("Test Case : BookBusTicketAndPrint");
		//Steps : launch , login , bookTicket , print , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookTicket();
		home.printTicket();
		login.logoutFromApplication();
		login.closeApplication();
	}
	
	@Test
	public void bookBusTicketAndCancel()
	{
		System.out.println("Test Case : BookBusTicketAndCancel");
		//Steps : launch , login , bookTicket , cancel , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookTicket();
		cancelTicket.navigateToCancelTicket();
		cancelTicket.cancelBusTicket();
		login.logoutFromApplication();
		login.closeApplication();
	}
	
	@Test
	public void bookBusTicketAndTrackService()
	{
		System.out.println("Test Case : BookBusTicketAndTrackService");
		//Steps : launch , login , bookTicket , track , logout , close 
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookTicket();
		trackService.navigateToTrackService();
		trackService.trackTheBusService();
		login.logoutFromApplication();
		login.closeApplication();
	}
	
	@Test
	public void bookBusTicketAndCheckStatus()
	{
		System.out.println("Test Case : BookBusTicketAndCheckStatus");
		//Steps : launch , login , bookTicket , ticketStatus , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookTicket();
		ticketStatus.navigateToTicketStatus();
		ticketStatus.checkBusTicketStatus();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookBusTicketCheckStatusAndPrint()
	{
		System.out.println("Test Case : BookBusTicketCheckStatusAndPrint");
		//Steps : launch , login , bookTicket , print , checkStatus , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookTicket();
		home.printTicket();
		ticketStatus.navigateToTicketStatus();
		ticketStatus.checkBusTicketStatus();
		login.logoutFromApplication();
		login.closeApplication();
	}

}
