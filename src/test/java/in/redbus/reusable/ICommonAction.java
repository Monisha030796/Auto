package in.redbus.reusable;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;



public interface ICommonAction {
	public void browserLaunch();
	public void browserClose();
	public void passValue(WebElement e,String value);
	public void click(WebElement e);
	public void actionClick(WebElement e);
	public void moveToElement(WebElement e);
	public void rightClick(WebElement e);
	public void doubleClick(WebElement e);
	public void scrollUp(WebElement e);
	public void scrollDown(WebElement e);
	public void clear(WebElement e);
	public void displayed(WebElement e);
	public void selected(WebElement e);
	public void enabled(WebElement e);
	public void selectByValue(WebElement e,String s);
	public void selectByVisibleText(WebElement e,String s);
	public void selectByIndex(WebElement e,int i);
	public List<WebElement> getOptions(WebElement e);
	public void deselectByValue(WebElement e,String s);
	public void deselectByIndex(WebElement e,int i);
	public void deselectByVisibleText(WebElement e,String s);
	public void screenShot(String name)throws IOException ;
	public void handleWindows();
	public void quit();
	public String getTitle(WebElement e);
	public String getCurrentUrl(WebElement e);
	public String getPageSource(WebElement e);
	public String getText(WebElement e);
	public String getAttribute(WebElement e,String value);
	public void refreshPage();
	public void back();
	public void forword();
	public void homeFrame();
	public void frameSwitch(String value);
	
}
