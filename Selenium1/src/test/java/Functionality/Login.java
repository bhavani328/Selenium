package Functionality;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import Object_repository.Elements;

public class Login {
	@Test
	public void login_fun() throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.manage().window().maximize();		
		d1.get("https://phptravels.org/login");
		Elements.emailAddress(d1).sendKeys("bhavanigovindolla@gmail.com");
		Elements.password(d1).sendKeys("Bhavani@123");
		Thread.sleep(50000);
		Elements.login(d1).click();
		/*TakesScreenshot tks=(TakesScreenshot) d1;
		File Source=tks.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\govindolla.bhavani\\OneDrive - HCL Technologies Ltd\\Pictures\\Screenshots\\screen1.jpg");
		FileHandler.copy(Source, destination);*/
		Robot rbt=new Robot();
		Dimension dm=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec=new Rectangle(dm);
		BufferedImage Source=rbt.createScreenCapture(rec);
		File destination=new File("C:\\Users\\govindolla.bhavani\\OneDrive - HCL Technologies Ltd\\Pictures\\Screenshots\\pom.jpg");
		ImageIO.write(Source, "jpg", destination);
		
	}

}
