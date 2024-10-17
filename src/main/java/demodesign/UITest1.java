package demodesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest1 {
	@Test
	public void startbrowser() throws InterruptedException {
		System.out.println("&&&&&&&&&&&&&&5------------------------");
		Thread.sleep(16000);

			 WebDriver driver=new FirefoxDriver();
	System.out.println("&&&&&&&&&&&&&&6------------------------");	
		driver.manage().window().maximize();
		driver.get("https://google.com");
		System.out.println("&&&&&&&&&&&&&&------------------------");
		Thread.sleep(4000);
		driver.quit();
}
}