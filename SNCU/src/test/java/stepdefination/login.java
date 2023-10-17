package stepdefination;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class login {

	static WebDriver driver;

	public login(WebDriver driver) {
		login.driver = driver;
	}

	public static void login() throws InterruptedException, IOException, TesseractException {

		driver.get("https://sncuindiaonline.org/d_loginAction");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@src='images/refresh.png']")).click();
		Thread.sleep(2000);

		WebElement username = driver.findElement(By.xpath("//input[@name='loginId1']"));
		username.sendKeys("admin");
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.xpath("//input[@name='password1']"));
		password.sendKeys("Seturam@1");
		Thread.sleep(2000);

		WebElement imageelement = driver.findElement(By.xpath("(//*[@id='CapsWarn']//following::img)[1]"));

		File src = imageelement.getScreenshotAs(OutputType.FILE);

		String path = "E:\\Smart RTU\\SNCU\\captchaimages\\captcha.png";

		FileHandler.copy(src, new File(path));

		Thread.sleep(2000);

		ITesseract image = new Tesseract();

		String str = image.doOCR(new File(path));

		WebElement captcha = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		captcha.sendKeys(str);
		Thread.sleep(2000);

	
		
		

	}
}