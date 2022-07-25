package org.demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\admin\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();	
	
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("src")).sendKeys("Chennai");
	

	driver.findElement(By.xpath("//li[@class='selected']")).click();
	
	driver.findElement(By.id("dest")).sendKeys("Aruppukottai");;
driver.findElement(By.xpath("//li[@class='selected']")).click();
driver.findElement(By.id("onward_cal")).click();

driver.findElement(By.xpath("//td[@class='current day']")).click();
driver.findElement(By.xpath("//button[@class='fl button']")).click();
List<WebElement> allbuses = driver.findElements(By.xpath("//div[@id='result-section']//div[@class='travels lh-24 f-bold d-color']"));
int s = allbuses.size();
System.out.println(s);
for (int i = 0; i <allbuses.size(); i++) {
	WebElement bus = allbuses.get(i);
	String t = bus.getText();
	System.out.println(t);
}
JavascriptExecutor js= (JavascriptExecutor)driver;
WebElement view = driver.findElement(By.xpath("(//div[text()='View Seats'])[1]"));
js.executeScript("arguments[0].click()", view);
Thread.sleep(10);
driver.findElement(By.xpath("//div[@class='upper-canvas canvas-wrapper']//canvas[@class='pointer']")).click();

}

}
