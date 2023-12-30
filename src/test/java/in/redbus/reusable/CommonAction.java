package in.redbus.reusable;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonAction implements ICommonAction {
public static WebDriver driver;
public static Actions a;
public static JavascriptExecutor js;

	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		   option.addArguments("disable-notifications");
		   option.addArguments("disable-popups");
		   option.addArguments("start-maximized");
		   driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	}

	public void browserClose() {
		driver.close();
		
	}

	public void passValue(WebElement e,String value) {
		e.sendKeys(value);
	}

	public void click(WebElement e) {
		e.click();
		
	}

	public void actionClick(WebElement e) {
		e.click();
	}

	public void moveToElement(WebElement e) {
     a.moveToElement(e).build().perform();
     
		
	}


	public void rightClick(WebElement e) {
		a.contextClick(e).build().perform();
		
	}

	public void doubleClick(WebElement e) {
   a.doubleClick(e).build().perform();		
	}

	public void scrollUp(WebElement e) {
 		js.executeScript("arguments[0].scrollIntoView(true)", true);
	}

	public void scrollDown(WebElement e) {
  js.executeScript("arguments[0].scrollIntiView(true)",false)	;	
	}

	public void displayed(WebElement e) {
    e.isDisplayed();		
	}

	public void selected(WebElement e) {
  e.isSelected();		
	}

	public void enabled(WebElement e) {
   e.isEnabled();		
	}

	public void selectByValue(WebElement e, String s) {
      Select select=new Select(e);
      select.selectByValue(s);
      
	
	}

	public void selectByVisibleText(WebElement e, String s) {
		Select select=new Select(e);
		select.selectByVisibleText(s);
	}

	public void selectByIndex(WebElement e, int i) {
		Select select=new Select(e);
		select.selectByIndex(i);
	}

	public List<WebElement> getOptions(WebElement e) {
		Select select=new Select(e);
		List<WebElement> option =  select.getOptions();
		return option;
	}

	public void deselectByValue(WebElement e, String s) {
		Select select=new Select(e);
		select.deselectByValue(s);
	}

	public void deselectByIndex(WebElement e, int i) {
		Select select=new Select(e);
		select.deselectByIndex(i);
	}

	public void deselectByVisibleText(WebElement e, String s) {
		Select select=new Select(e);
		select.deselectByVisibleText(s);
	}

	public void screenShot(String name) throws IOException {
    TakesScreenshot tk=(TakesScreenshot)driver;
    File des=tk.getScreenshotAs(OutputType.FILE);
    File source=new File(".\\target\\"+name+".png");
    FileUtils.copyFile(des, source);
	}

	public String getTitle(WebElement e) {
		String title = driver.getTitle();
		return title;
	
	}

	public String getCurrentUrl(WebElement e) {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	
	}

	public String getPageSource(WebElement e) {
		String pageSource = driver.getPageSource();
	    return pageSource;
	    }

	public String getText(WebElement e) {

	
		String text = e.getText();
		return text;
	}
	public String getAttribute(WebElement e, String value) {
		String attribute = e.getAttribute(value);
		return attribute;
	
	}

	public void frameSwitch(String value) {
		driver.switchTo().frame(value);
		
	}


	public void clear(WebElement e) {
e.clear();
		
	}


	public void handleWindows() {
      String parent = driver.getWindowHandle();
      Set<String> children = driver.getWindowHandles();
		for(String child:children) {
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
			}
		}
	}

	public void quit() {
     driver.quit();		
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	public void back() {
		driver.navigate().back();
		
	}

	public void forword() {
		driver.navigate().forward();		
	}

	public void homeFrame() {
 driver.switchTo().defaultContent();		
	}




}
