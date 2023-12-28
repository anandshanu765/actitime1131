package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 //URl navigation
	  driver.get("https://timetracker.ctepl.com/actitime/login.do");
	  Thread.sleep(2000);
	  //maximaze
	  driver.manage().window().maximize();
	  //value pass username
	  Thread.sleep(2000);;
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("manager");
	  //value pass password
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='Login']")).click();
	  Thread.sleep(2000);
	  String abc = driver.getTitle();
	  System.out.println(abc);
	  String expected = "Username";
	  String actual = "Username or Password is invalid. Please try again.";
	  System.out.println(actual);
	  
	  if (actual.contains(expected))
	  {
		  System.out.println("pass");
	  }
	  else
	  {
		  System.out.println("fail");
	  }
	  
	  
	  
	}

}
