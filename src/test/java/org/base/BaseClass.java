package org.base;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {	
	public static WebDriver driver;
	public WebElement findingElement(String locator,String value) {
		if(locator.equals("id")) {
			WebElement element = driver.findElement(By.id(value));
			return element;
		}else if(locator.equals("name")) {
			WebElement element = driver.findElement(By.name(value));
			return element;
		}else if(locator.equals("classname")) {
			WebElement element = driver.findElement(By.className(value));
			return element;
		}else if(locator.equals("linkText")) {
			WebElement element = driver.findElement(By.linkText(value));
			return element;
		}else if(locator.equals("partialLinkText")) {
			WebElement element = driver.findElement(By.partialLinkText(value));
			return element;
		}else if(locator.equals("xpath")) {
			WebElement element = driver.findElement(By.xpath(value));
			return element;
		}else if(locator.equals("tagname")) {
			WebElement element = driver.findElement(By.tagName(value));
			return element;
		}else {
			return null;
		}
	}
		public void passValue(WebElement ele,String value) {
			ele.sendKeys(value);	
		}

public void elementClick(WebElement element) {
	element.click();	
}
public String gettingText(WebElement element) {
	String text = element.getText();
	return text;
}
public String getAttribute(WebElement element, String value) {

	String attribute = element.getAttribute(value);
	return attribute;
	
}
public void selectByVisibleText(WebElement ele, String str) {
	Select select =new Select(ele);
	
	select.selectByVisibleText(str);
}
public void SelectByValue(WebElement ele,String str) {
      Select select=new Select(ele);
      select.selectByValue(str);
}
public void SelectByIndex(WebElement ele,String str) {
    Select select=new Select(ele);
    select.selectByValue(str);
}
public List<WebElement> getOptions(WebElement ele) {
	
	Select select=new Select(ele);
	List<WebElement> options = select.getOptions();
	return options;
}

public void clear(WebElement ele) {
  ele.clear();
}
public String getCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
}
//public String getPageSource() {
	//String pageSource = driver.getPageSource();
    //return pageSource;
//}
//public String getTitle( ) {
	//String title = driver.getTitle();
	//return title;
//}
public String getWindowHandle() {
	String windowHandle = driver.getWindowHandle();
    return windowHandle;
}
public Set<String> getWindowHandles() {
	Set<String> windowHandles = driver.getWindowHandles();
	return windowHandles;

}
public void refreshfPage() {
	driver.navigate().refresh();
}
public void back() {
	driver.navigate().back();
}
public void quit() {
	driver.quit();
}
public void close() {
	driver.close();
}
public void rightClick(WebElement ele) {
	Actions a=new Actions(driver);
	a.contextClick(ele).perform();
	}
public void doubleClick(WebElement ele) {
	Actions a=new Actions(driver);
	a.doubleClick(ele).perform();
}
public void moveElement(WebElement ele) {
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
}



    public static void browserLaunch(String browser) {
   	 
		switch (browser) {
		case "chrome": 
			driver=new ChromeDriver();
			break;
			case "edge":
				driver=new EdgeDriver();
				break;
			case "firefox":
				driver=new FirefoxDriver();
				break;
		}
		
		}

   public static void maximise() {
	driver.manage().window().maximize();

}
   public static void loadUrl(String url) {
	driver.get(url);

}
   public static void screenShot() throws IOException {
	   Random r=new Random();
	   int nextInt = r.nextInt(100);
	   String valueOf = String.valueOf(nextInt);
   TakesScreenshot sr=(TakesScreenshot)driver;
	File screenshotAs=sr.getScreenshotAs(OutputType.FILE);
	File destFile=new File("C:\\Users\\aruna\\eclipse-workspace\\eclipse\\MavenDemo\\target\\"+valueOf+".png");
	//FileHandler.copy(screenshotAs, destFile);
FileUtils.copyFile(screenshotAs, destFile);
}
   public static void quitBrowser() {
	   driver.quit();
	   
	   
   }
   public static void refreshPage() {
	   driver.navigate().refresh();
   }
   public  String excelRead(String path,String sheetName,int rowno,int cellno) throws IOException {
    File file=new File(path);
    FileInputStream inputStream=new FileInputStream(file);
    Workbook workbook=new XSSFWorkbook(inputStream);
    Sheet sheet = workbook.getSheet(sheetName);
    Row row = sheet.getRow(rowno);
    Cell cell = row.getCell(cellno);
    
    CellType cellType = cell.getCellType();
    DataFormatter data = new DataFormatter();
    String formatCellValue = data.formatCellValue(cell);
     
    return formatCellValue;
	
}
   

}















