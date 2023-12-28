package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login{
     
	public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      String expectedtitle= "google";
      driver.get("https://www.google.com");
      Thread.sleep(2000);
      driver.manage().window().maximize();
      Thread.sleep(2000);
      String actualtitle = driver.getTitle();
      Thread.sleep(2000);
      System.out.println(actualtitle);
      String pagesource = driver.getPageSource();
      Thread.sleep(2000);
      System.out.println(pagesource);
      driver.navigate().to("https://www.instagram.com");
      Thread.sleep(2000);
      driver.navigate().refresh();
      Thread.sleep(2000);
      driver.navigate().back();
      
	  }

}
