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

import Object_repository.Account;


public class Register {
	@Test
	public void reg_fun() throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.manage().window().maximize();	
		d1.get("https://phptravels.org/register.php");
		Account.firstName(d1).sendKeys("bhavani");
		Account.lastName(d1).sendKeys("govindolla");
		Account.emailAddress(d1).sendKeys("bhavanigovindolla@gmail.com");
		Account.phoneNo(d1).sendKeys("8367349804");
		Account.streetAddr(d1).sendKeys("shakkarnagar,bodhan");
		Account.city(d1).sendKeys("bodhan");
		Account.country(d1).sendKeys("india");
		Account.password(d1).sendKeys("Bhavani@123");
		Account.confirmPassword(d1).sendKeys("Bhavani@123");
		Thread.sleep(30000);
		Account.register(d1).click();
		/*TakesScreenshot tks=(TakesScreenshot) d1;
		File Source=tks.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\govindolla.bhavani\\OneDrive - HCL Technologies Ltd\\Pictures\\Screenshots\\screen.jpg");
		FileHandler.copy(Source, destination);*/
		
		}

}
