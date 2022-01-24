import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Git2 {
	 @Test
	 	public void test() {

	 	System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
	 	WebDriver d1;
	 	d1=new ChromeDriver();
	 	d1.get("http://demo.automationtesting.in/Datepicker.html");

	 	JavascriptExecutor jse=(JavascriptExecutor) d1;

	 	jse.executeScript("document.getElementById('datepicker1').value='31/12/2021'");

	 	jse.executeScript("document.getElementById('datepicker2').value='01/01/2022'");
	 	}
}
