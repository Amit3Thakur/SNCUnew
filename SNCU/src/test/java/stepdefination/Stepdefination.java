package stepdefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.sourceforge.tess4j.TesseractException;

public class Stepdefination {

	WebDriver driver;
	login page;
	Report check;

	@BeforeTest
	public void startup() {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		page = new login(driver);
		check = new Report(driver);
	}

	@Test(priority = 0)
	public void page() throws InterruptedException, IOException, TesseractException {
		login.login();
	}

	@Test(priority = 1)
	public void check() throws InterruptedException, IOException, TesseractException {
		Report.Report();

	}

}
