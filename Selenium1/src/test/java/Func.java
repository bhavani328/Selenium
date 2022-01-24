import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Func {
	public static WebElement emailAddress(WebDriver d1) {
		return d1.findElement(By.id("inputEmail"));
		
		}
		public static WebElement password(WebDriver d1) {
		return d1.findElement(By.id("inputPassword"));	
		}
		public static WebElement login(WebDriver d1) {
		return d1.findElement(By.xpath("//input[@value='Login']"));	
}
}
