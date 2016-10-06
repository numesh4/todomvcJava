package unisuperPackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class testing {

	public static void main(String[] args) {
		
		
	
		
		WebDriver driver=new FirefoxDriver();
		Actions action=new Actions(driver);
		JavascriptExecutor js= (JavascriptExecutor) driver;
				
		
		
		//driver.get("http://javascriptkit.com/javatutors/event2.shtml");
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//if(driver instance of JavascriptExecutor){
			//((JavascriptExecutor)driver).executeScript("alert('hello!')",null);}
		
		//Clicks on Angular.js-------------------
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		js.executeScript("console.log('oops');");
	}

}
