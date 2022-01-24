import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Object_repository.Elements;

public class Login {
  @Test(enabled=false)
  public void login_fun() throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.manage().window().maximize();		
		d1.get("https://phptravels.org/login");
		Func.emailAddress(d1).sendKeys("bhavanigovindolla@gmail.com");
		Func.password(d1).sendKeys("Bhavani@123");
		Thread.sleep(50000);
		Func.login(d1).click();
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
		File f2=new File("C:\\Users\\govindolla.bhavani\\OneDrive - HCL Technologies Ltd\\Pictures\\Saved Pictures\\cookies.data");
		try {
			f2.createNewFile();
			FileWriter fw=new FileWriter(f2);
			BufferedWriter bw=new BufferedWriter(fw);
			//Cookie cw=new Cookie("mycookie","3635");
			//d1.manage().addCookie(cw);
			//d1.manage().deleteCookie(cw);
			//d1.manage().deleteAllCookie();
			//d1.manage().deleteCookieNamed("mycookie");
		

			for(Cookie ck:d1.manage().getCookies()) {
			bw.write(ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getValue()+";"+ck.isSecure()+";"+ck.getExpiry());
			bw.newLine();
			}
			bw.close();
			fw.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
  @Test
  public void pdf() {
	  
  }

}
