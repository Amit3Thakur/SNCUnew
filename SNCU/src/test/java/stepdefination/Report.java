package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Report {

	static WebDriver driver;

	public Report(WebDriver driver) {
		Report.driver = driver;
	}

	public static void Report() throws InterruptedException {

		Actions actions = new Actions(driver);

		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);

		// ------------Daily Status Report

		WebElement elementToHover = driver.findElement(By.xpath("(//a[@href='d_loginAction'])[1]"));
		Thread.sleep(1000);

		// Perform the hover action
		actions.moveToElement(elementToHover).build().perform();

		// You can now interact with sub-elements that become visible after the hover
		// action
		WebElement subElement = driver.findElement(By.xpath("//a[@href='dailyStatusAdminReportAction?operation=Get']"));
		subElement.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@value='Excel']")).click();
		Thread.sleep(2000);

		// ------------Admission and Outcome Report

		WebElement elementToHover1 = driver.findElement(By.xpath("(//a[@href='d_loginAction'])[1]"));
		Thread.sleep(1000);

		actions.moveToElement(elementToHover1).build().perform();

		WebElement subElement1 = driver.findElement(By.xpath("//a[@href='admissionReportListAction?operation=Get']"));
		subElement1.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@value='Excel']")).click();
		Thread.sleep(2000);

		// ----------------------------------HR List

		WebElement elementToHover3 = driver.findElement(By.xpath("(//a[@href='d_loginAction'])[1]"));
		Thread.sleep(1000);

		actions.moveToElement(elementToHover3).build().perform();

		WebElement subElement3 = driver.findElement(By.xpath("//a[@href='d_doctorListAction']"));
		subElement3.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@value='Excel1']")).click();
		Thread.sleep(2000);

		// ----------------------------------href="d_dataComparisonReportListAction"

		WebElement elementToHover4 = driver.findElement(By.xpath("(//a[@href='d_dataComparisonReportListAction"));
		Thread.sleep(1000);

		actions.moveToElement(elementToHover4).build().perform();

		WebElement subElement4 = driver.findElement(By.xpath("//a[@href='d_doctorListAction']"));
		subElement4.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@value='Excel1']")).click();
		Thread.sleep(2000);

	}

}
