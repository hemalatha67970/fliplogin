package org.demo;

import java.util.List;
import java.util.ListIterator;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collectors;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.util.internal.SystemPropertyUtil;

public class Demo {
	public static void main(String[] args) throws IOException, InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		
	driver.get("https://7904211399:bestlife@97@www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//div[@class='_36HLxm col col-3-5']//child::input[@type='text']")).sendKeys("7904211399");
	driver.findElement(By.xpath("//div[@class='_36HLxm col col-3-5']//child::input[@type='password']")).sendKeys("bestlife@97");
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	driver.findElement(By.name("q")).sendKeys("iphone");
	driver.findElement(By.xpath("//button[@type='submit']")).submit();
	driver.navigate().refresh();
	Thread.sleep(10);
	WebElement iphone11 = driver.findElement(By.xpath("//div[@class='_1AtVbE col-12-12']//child::div[text()='APPLE iPhone 11 (Black, 64 GB)']"));
	try {
		iphone11.click();
	} catch (StaleElementReferenceException e) {
		iphone11 = driver.findElement(By.xpath("//div[@class='_1AtVbE col-12-12']//child::div[text()='APPLE iPhone 11 (Black, 64 GB)']"));	
	iphone11.click();
	}
	String parentId = driver.getWindowHandle();
	Set<String> allwindows = driver.getWindowHandles();
	System.out.println(allwindows.size());
	List<String> li= new LinkedList<String>();
	li.addAll(allwindows);
	driver.switchTo().window(li.get(1));

try{
	WebElement addcart = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
	addcart.click();
}catch(StaleElementReferenceException e) {
	WebElement addcart = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
	addcart.click();
	}

	}
	
}
