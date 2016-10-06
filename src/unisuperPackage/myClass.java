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
//import org.openqa.selenium.remote.DesiredCapabilities;


public class myClass {

	public static void main(String[] args) throws InterruptedException {
		
	//System.setProperty("webdriver.gecko.driver","C://Users/kritzy2922/Documents/Desktop/Unisuper//geckodriver.exe");	
	
	WebDriver driver=new FirefoxDriver();
	Actions action=new Actions(driver);
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	
	//driver.get("http://javascriptkit.com/javatutors/event2.shtml");
	driver.get("http://todomvc.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//if(driver instance of JavascriptExecutor){
		//((JavascriptExecutor)driver).executeScript("alert('hello!')",null);}
	
	//Clicks on Angular.js-------------------
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/iron-pages/div[1]/ul/li[2]/a")).click();
	Thread.sleep(5000);
	
	//Types item1 in to-do text-area-----------------------
	WebElement todotextbox =driver.findElement(By.xpath("/html/body/ng-view/section/header/form/input"));
	todotextbox.sendKeys("item1"+Keys.ENTER);
	Thread.sleep(2000);
	//double clicks on first item-----------------------------
	WebElement todoitem=driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/div/label"));
	action.doubleClick(todoitem).perform();
	//Thread.sleep(2000);
	
	//replaces "item1" with "ITEM!"---------------------------------
	WebElement todoitemEdit=driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/form/input"));
	todoitemEdit.sendKeys(Keys.CONTROL+"a");
	todoitemEdit.sendKeys(Keys.DELETE);
	Thread.sleep(2000);
	todoitemEdit.sendKeys("ITEM!"+Keys.ENTER);
	
	Thread.sleep(2000);
	WebElement todoCheck=driver.findElement(By.xpath("./html/body/ng-view/section/section/ul/li[1]/div/input[@ng-model='todo.completed']"));
	action.moveToElement(todoCheck).click().build().perform();
	Thread.sleep(2000);
	action.moveToElement(todoCheck).click().build().perform();

	Thread.sleep(2000);
	WebElement todoDel=driver.findElement(By.xpath("./html/body/ng-view/section/section/ul/li[1]/div/button[@class='destroy']"));
	action.moveToElement(todoDel).click().build().perform();
	
	//Select select=new Select(todoCheck);
	//select.selectByValue("ITEM!");
	
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//todo.sendKeys("item2"+Keys.ENTER);
	
	
	
	//driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/div/button")).click();
	//((JavascriptExecutor) driver).executeScript("removeTodo(1)");
	//driver.findElement(By.name("fd0")).click();
	//((JavascriptExecutor) driver).executeScript("document.getElementsByName('fd0').click()");
	//((JavascriptExecutor) driver).executeScript("inform()", null);
	/*
	WebDriver driver2=new ChromeDriver();
	if(driver2 instanceof JavascriptExecutor){
		((JavascriptExecutor)driver2).executeScript("alert('hello!')",null);
	}
	*/
	
	
	/*System.setProperty("webdriver.gecko.driver","C://Users/kritzy2922/Documents/Desktop/Unisuper/geckodriver-v0.10.0-win64");
		DesiredCapabilities capab=DesiredCapabilities.firefox();
		capab.setCapability("marionette",true);
		WebDriver driver = new FirefoxDriver(capab);
		driver.get("http://example.com");
		driver.close();
*/
	
	
		

	
	
	}
}

