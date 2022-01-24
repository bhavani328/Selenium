import java.util.Set;
import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Frames {
@Test(enabled=false)
  public void frameTest() throws InterruptedException {

  System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
  WebDriver d1;
  d1 = new ChromeDriver();
  d1.get("http://demo.automationtesting.in/Frames.html");
  d1.manage().window().maximize();


  d1.switchTo().frame(0);
  d1.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("hi");
  Thread.sleep(1000);
  d1.switchTo().defaultContent();

  d1.findElement(By.linkText("Iframe with in an Iframe")).click();

  d1.switchTo().frame(1);
  WebElement web = d1.findElement(By.xpath("//iframe[@src = 'SingleFrame.html']"));

  d1.switchTo().frame(web);
  Thread.sleep(1000);
  d1.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("hello");
  Thread.sleep(1000);
  d1.switchTo().parentFrame();
  System.out.println("switched to parent frame");
  d1.switchTo().defaultContent();
  System.out.println("switched to main frame");

  d1.close();
}
@Test(enabled=false)
public void window() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
WebDriver d1;
d1=new ChromeDriver();
d1.get("http://demo.automationtesting.in/Windows.html");
String w1=d1.getTitle();
d1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
Set<String> windows=d1.getWindowHandles();
Iterator<String> iter=windows.iterator();
String window1=iter.next();
String window2=iter.next();
d1.switchTo().window(window2);
String w2=d1.getTitle();
System.out.println(w1);
System.out.println(w2);
System.out.println(window1);
System.out.println(window2);

}



@Test(enabled=false)

public void dragandrop() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://www.leafground.com/pages/drag.html");
	WebElement ele1=d1.findElement(By.id("draggable"));
	Actions act1=new Actions(d1);
	act1.dragAndDropBy(ele1, 90,100).build().perform();
	d1.navigate().to("http://www.leafground.com/pages/drop.html");
	Actions act2=new Actions(d1);
	WebElement ele3=d1.findElement(By.id("draggable"));
	WebElement ele2=d1.findElement(By.id("droppable"));
	act2.dragAndDrop(ele3, ele2).build().perform();
	}
	@Test


	public void alert(){
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://demo.automationtesting.in/Alerts.html");
	
	d1.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
	String msg=d1.switchTo().alert().getText();
	System.out.println(msg);
	d1.switchTo().alert().dismiss();
	
	d1.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
	d1.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
	d1.switchTo().alert().dismiss();
	
	d1.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
	d1.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
	d1.switchTo().alert().sendKeys("HCL Technologies");
	d1.switchTo().alert().accept();
	

}
}
