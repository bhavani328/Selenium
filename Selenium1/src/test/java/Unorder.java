

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Unorder {
	@Test(enabled=false)
	public void Unorder() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
	WebDriver d1=new ChromeDriver();
	d1.get("http://demo.automationtesting.in/AutoComplete.html");
	d1.findElement(By.id("searchbox")).sendKeys("A");
	Thread.sleep(3000);
	List<WebElement> ele=d1.findElements(By.xpath("//*[@id=\"ui-id-1\"]"));

	for(WebElement e:ele)
	{
	if(e.getText().equalsIgnoreCase("canada"))
	{
	e.click();
	break;
	}
	}
	}
	@Test(enabled=false)
	public void Unorder1() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
	WebDriver d1=new ChromeDriver();
	d1.get("http://demo.automationtesting.in/Selectable.html");
	d1.findElement(By.id("Default"));
	Thread.sleep(3000);
	List<WebElement> ele=d1.findElements(By.xpath("//*[@id=\"Default\"]/ul"));
	for(WebElement e:ele)
	{
	if(e.getText().equalsIgnoreCase("Sakinalium - Extent Reports"))
	{
	e.click();
	break;
	}
	}
}
	@Test(enabled=false)
	public void getTxt()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
	WebDriver d1=new ChromeDriver();
	d1.get("http://www.leafground.com/pages/table.html");
	d1.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[2]/td[3]/input")).click();
	String table_txt=d1.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[2]/td[4]")).getText();
	System.out.println(table_txt);
	System.out.println(d1.getCurrentUrl());
	System.out.println(d1.getPageSource());
	d1.navigate().back();
	d1.navigate().forward();
	d1.navigate().refresh();
	d1.navigate().to("http://www.leafground.com/");
	d1.manage().window().maximize();
	Dimension d=new Dimension(250,450);
	d1.manage().window().setSize(d);
	}
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

