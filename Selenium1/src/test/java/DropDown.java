
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class DropDown {
  @Test(enabled=false)
public void amazon() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.navigate().to("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Flog%2Fs%2F%3F_encoding%3DUTF8%26k%3Dlog%2520in%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		wd.findElement(By.id("ap_customer_name")).sendKeys("Bhavani");
		wd.findElement(By.id("ap_email")).sendKeys("bhavanigovindolla@gmail.com");
		wd.findElement(By.id("ap_password")).sendKeys("P@ssword");
		wd.findElement(By.id("ap_password_check")).sendKeys("P@ssword");
	}


	@Test(enabled=false)
	public void drop_down() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://www.leafground.com/pages/Dropdown.html");
	Select drop1=new Select(d1.findElement(By.id("dropdown1")));
	drop1.deselectByVisibleText("UFT/QTP");
	Select drop2=new Select(d1.findElement(By.name("dropdown2")));
	drop2.deselectByValue("2");
	Select drop3=new Select(d1.findElement(By.id("dropdown3")));
	drop3.deselectByIndex(4);
	Select drop4=new Select(d1.findElement(By.className("dropdown")));
	//Boolean msg=drop4.selectAll();
	//System.out.println(msg);
	}
	@Test(enabled=false)
	public void testleaf_button1(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");		
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Button.html");
		wd.findElement(By.id("home")).click();
		wd.close();
	}
	@Test(enabled=false)
	public void testleaf_button2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Button.html");
		wd.findElement(By.id("position")).click();
		wd.close();
		
	}
	
	@Test(enabled=false)
	public void testleaf_button3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Button.html");
		wd.findElement(By.id("color")).click();
		wd.close();
		
	}
	@Test(enabled=false)
	public void testleaf_button4() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Button.html");
		wd.findElement(By.id("size")).click();
		wd.close();
		
	}
	@Test(enabled=false)
	public void testleaf_links1(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Link.html");
		wd.findElement(By.linkText("Go to Home Page")).click();	
	}

	@Test(enabled=false)
	public void testleaf_links2(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Link.html");
		wd.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();	
	}
	
	@Test(enabled=false)
	public void testleaf_links3(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Link.html");
		wd.findElement(By.linkText("Verify am I broken?")).click();	
	}
	
	@Test(enabled=false)
	public void testleaf_links4(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Link.html");
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/a")).click();	
	}
	@Test(enabled=false)
	public void testleaf_image1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Image.html");
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img")).click();
	}
	
	@Test(enabled=false)
	public void testleaf_image2() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Image.html");
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img")).click();
	}
	
	@Test(enabled=false)
	public void testleaf_image3() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Image.html");
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img")).click();
	}
	@Test(enabled=false)
	public void radio_buttons() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/");
		wd.findElement(By.linkText("Radio Button")).click();
		wd.findElement(By.id("yes")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]")).click();
		wd.close();
		
	}
	
	@Test(enabled=false)
	public void checkbox() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govindolla.bhavani\\Downloads\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/");
		wd.findElement(By.linkText("Checkbox")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[2]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[4]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[5]/input")).click();	
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input")).click();		
		wd.close();
			
	}
}
	
