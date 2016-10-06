package unisuperPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.remote.DesiredCapabilities;


public class myClass {

	public static void main(String[] args) throws InterruptedException {

		
		//--------------firefox test-------------------------
	WebDriver driver=new FirefoxDriver();
	Actions action=new Actions(driver);
	
		
	driver.get("http://todomvc.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	//----------Clicks on Angular.js-------------------
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/iron-pages/div[1]/ul/li[2]/a")).click();
	Thread.sleep(5000);
	
	//------------Adds first to-do Item-----------------------
	WebElement todotextbox =driver.findElement(By.xpath("/html/body/ng-view/section/header/form/input"));
	todotextbox.sendKeys("item1"+Keys.ENTER);
	Thread.sleep(2000);
	
	//----------Double clicks on first item-----------------------------
	WebElement todoitem=driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/div/label"));
	action.doubleClick(todoitem).perform();
		
	//----------------replaces content of existing to-do Item---------------------------------
	WebElement todoitemEdit=driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/form/input"));
	todoitemEdit.sendKeys(Keys.CONTROL+"a");
	todoitemEdit.sendKeys(Keys.DELETE);
	Thread.sleep(2000);
	todoitemEdit.sendKeys("ITEM!"+Keys.ENTER);
	
	//-------------Complete a to-do item by clicking on the UI----------------------------------------
	Thread.sleep(2000);
	WebElement todoCheck=driver.findElement(By.xpath("./html/body/ng-view/section/section/ul/li[1]/div/input[@ng-model='todo.completed']"));
	action.moveToElement(todoCheck).click().build().perform();
	
	//------------Reactivate a completed to-do item---------------------------
	Thread.sleep(2000);
	action.moveToElement(todoCheck).click().build().perform();

	//-----------Add a second to-do--------------------------
	Thread.sleep(2000);
	todotextbox.sendKeys("item2"+Keys.ENTER);
	
	//-----------------Complete all to-do's---------------
	Thread.sleep(2000);
	WebElement todoCheckAll=driver.findElement(By.xpath(".//html/body/ng-view/section/section/input[@id='toggle-all']"));
	action.moveToElement(todoCheckAll).click().build().perform();
	
	//----------------filter to view only completed To-do's-------------------
	Thread.sleep(2000);
	WebElement todocompleted=driver.findElement(By.cssSelector("a[href='#/completed']"));
	action.moveToElement(todocompleted).click().build().perform();

	//--------------------clear a single to-do item (completed to-do item)---------
	Thread.sleep(2000);
	todoCheck=driver.findElement(By.xpath("./html/body/ng-view/section/section/ul/li[1]/div/input[@ng-model='todo.completed']"));
	action.moveToElement(todoCheck).build().perform();
	Thread.sleep(2000);
	WebElement todoDel=driver.findElement(By.xpath("./html/body/ng-view/section/section/ul/li[1]/div/button[@class='destroy']"));
	action.moveToElement(todoDel).click().build().perform();
	
	
	
	//-------------------Clear all completed to-do items--------------------	
	Thread.sleep(2000);
	WebElement todoDelAll=driver.findElement(By.xpath("./html/body/ng-view/section/footer/button[@id='clear-completed']"));
	action.moveToElement(todoDelAll).click().build().perform();
	
	
	
	
	
	//--------------chrome test-----------------
	WebDriver driver2=new ChromeDriver();
	Actions action2=new Actions(driver2);
	
		
	driver2.get("http://todomvc.com");
	driver2.manage().window().maximize();
	driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	//----------Clicks on Angular.js-------------------
	driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver2.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/iron-pages/div[1]/ul/li[2]/a")).click();
	Thread.sleep(5000);
	
	//------------Adds first to-do Item-----------------------
	WebElement todotextbox_chrome =driver2.findElement(By.xpath("/html/body/ng-view/section/header/form/input"));
	todotextbox_chrome.sendKeys("item1"+Keys.ENTER);
	Thread.sleep(2000);
	
	//----------Double clicks on first item-----------------------------
	WebElement todoitem_chrome=driver2.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/div/label"));
	action2.doubleClick(todoitem_chrome).perform();
		
	//----------------replaces content of existing to-do Item---------------------------------
	WebElement todoitemEdit_chrome=driver2.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/form/input"));
	todoitemEdit_chrome.sendKeys(Keys.CONTROL+"a");
	todoitemEdit_chrome.sendKeys(Keys.DELETE);
	Thread.sleep(2000);
	todoitemEdit_chrome.sendKeys("ITEM!"+Keys.ENTER);
	
	//-------------Complete a to-do item by clicking on the UI----------------------------------------
	Thread.sleep(2000);
	WebElement todoCheck_chrome=driver2.findElement(By.xpath("./html/body/ng-view/section/section/ul/li[1]/div/input[@ng-model='todo.completed']"));
	action2.moveToElement(todoCheck_chrome).click().build().perform();
	
	//------------Reactivate a completed to-do item---------------------------
	Thread.sleep(2000);
	action2.moveToElement(todoCheck_chrome).click().build().perform();

	//-----------Add a second to-do--------------------------
	Thread.sleep(2000);
	todotextbox_chrome.sendKeys("item2"+Keys.ENTER);
	
	//-----------------Complete all to-do's---------------
	Thread.sleep(2000);
	WebElement todoCheckAll_chrome=driver2.findElement(By.xpath(".//html/body/ng-view/section/section/input[@id='toggle-all']"));
	action2.moveToElement(todoCheckAll_chrome).click().build().perform();
	
	//----------------filter to view only completed To-do's-------------------
	Thread.sleep(2000);
	WebElement todocompleted_chrome=driver2.findElement(By.cssSelector("a[href='#/completed']"));
	action2.moveToElement(todocompleted_chrome).click().build().perform();

	//--------------------clear a single to-do item (completed to-do item)---------
	Thread.sleep(2000);
	todoCheck_chrome=driver2.findElement(By.xpath("./html/body/ng-view/section/section/ul/li[1]/div/input[@ng-model='todo.completed']"));
	action2.moveToElement(todoCheck_chrome).build().perform(); // hover over close button
	Thread.sleep(2000);
	WebElement todoDel_chrome=driver2.findElement(By.xpath("./html/body/ng-view/section/section/ul/li[1]/div/button[@class='destroy']"));
	action2.moveToElement(todoDel_chrome).click().build().perform();
	
	
	
	//-------------------Clear all completed to-do items--------------------	
	Thread.sleep(2000);
	WebElement todoDelAll_chrome=driver2.findElement(By.xpath("./html/body/ng-view/section/footer/button[@id='clear-completed']"));
	action2.moveToElement(todoDelAll_chrome).click().build().perform();
	
	
	
	}
}

