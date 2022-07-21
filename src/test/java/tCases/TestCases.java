package tCases;

import org.junit.Test;

import pageObjects.Home;
import pageObjects.Login;

public class TestCases //extends Login
{
	Login login = new Login();
	Home home = new Home();
	@Test
	public void bookBusTicketAndPrint()
	{
		System.out.println("Test Case : BookBusTicketAndPrint");
		//Steps : launch , login , bookTicket , print , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.bookTicket();
		home.printTicket();
		login.logoutFromApplication();
		login.closeApplication();
	}
	
	@Test
	public void bookBusTicketAndCancel()
	{
		System.out.println("Test Case : BookBusTicketAndCancel");
		//Steps : launch , login , bookTicket , print , logout , close
		login.launchApplication();
		login.loginToApplication();
	}
	
	@Test
	public void bookBusTicketAndTrackService()
	{
		System.out.println("Test Case : BookBusTicketAndTrackService");
		//Steps : launch , login , bookTicket , print , logout , close
	}
	
	@Test
	public void bookBusTicketAndCheckStatus()
	{
		System.out.println("Test Case : BookBusTicketAndCheckStatus");
		//Steps : launch , login , bookTicket , print , logout , close
	}
	@Test
	public void bookBusTicketCheckStatusAndPrint()
	{
		System.out.println("Test Case : BookBusTicketCheckStatusAndPrint");
		//Steps : launch , login , bookTicket , print , logout , close
	}

}
