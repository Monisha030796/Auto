package in.redbus.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import in.redbus.reusable.CommonAction;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	CommonAction co=new CommonAction();
	@Before
	public void launch(Scenario scenario) {
		co.browserLaunch();
		final byte[] initial=((TakesScreenshot)co.driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(initial, "image/png");
	}
	@After
	public void close(Scenario scenario) {
	//co.browserClose();
	final byte[] initial=((TakesScreenshot)co.driver).getScreenshotAs(OutputType.BYTES);
	scenario.embed(initial, "image/png");
}
}
