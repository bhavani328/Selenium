package Object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Account {
	public static WebElement firstName(WebDriver d1) {
		return d1.findElement(By.id("inputFirstName"));
		}
	public static WebElement lastName(WebDriver d1) {
		return d1.findElement(By.id("inputLastName"));
		}
	public static WebElement emailAddress(WebDriver d1) {
		return d1.findElement(By.id("inputEmail"));
		}
	public static WebElement phone(WebDriver d1) {	
		return d1.findElement(By.name("country-calling-code-phonenumber"));
	}
	public static WebElement phoneNo(WebDriver d1) {
		return d1.findElement(By.id("inputPhone"));
		}
	public static WebElement comp(WebDriver d1) {
	return d1.findElement(By.id("inputCompanyName"));
	}
	public static WebElement streetAddr(WebDriver d1) {
		return d1.findElement(By.id("inputAddress1"));
		}
	public static WebElement streetAddr2(WebDriver d1)
	{
	return d1.findElement(By.id("inputAddress2"));
	}
	public static WebElement city(WebDriver d1) {
		return d1.findElement(By.id("inputCity"));
		}
	public static WebElement country(WebDriver d1) {
		return d1.findElement(By.id("inputCountry"));
		}
	public static WebElement mobile(WebDriver d1) {
		return d1.findElement(By.id("customfield2"));
		}
	
	public static WebElement password(WebDriver d1) {
		return d1.findElement(By.id("inputNewPassword1"));
		//return d1.findElement(By.name("password"));
		//return d1.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[1]/form/div[2]/div/div[2]/div/div[1]/input"));
		}
	public static WebElement confirmPassword(WebDriver d1) {
		//return d1.findElement(By.name("password2"));
		return d1.findElement(By.id("inputNewPassword2"));
		//return d1.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[1]/form/div[2]/div/div[3]/div/input"));
		}
	public static WebElement register(WebDriver d1) {
		return d1.findElement(By.xpath("//input[@value='Register']"));	
		}
}
