package org.demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2Amazon {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\admin\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
	driver.findElement(By.xpath("//input[@type='submit']")).click();

	driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (64GB) - Blue']")).click();
	Thread.sleep(10);
	String parentId = driver.getWindowHandle();
	
	Set<String> allwindows = driver.getWindowHandles();
	
	List<String> li= new ArrayList<>();
	li.addAll(allwindows);
	driver.switchTo().window(li.get(1));
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	driver.findElement(By.xpath("//input[@class='a-button-input']//ancestor::span[@id='attach-sidesheet-checkout-button']")).click();
}
}
