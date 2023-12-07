package org.junitpractice;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junitexe extends BaseClass {
	
	
	@BeforeClass
	public static void beforeClass() {
		browserLaunch("chrome");
		maximise();
	}
   @Before
    public void before() {
	   loadUrl("https://www.facebook.com/");
   }
   @Test
   public void fb() {
	   passValue(findingElement("id", "email"), "monisha");
	   passValue(findingElement("id", "pass"), "123456");
	   elementClick(findingElement("name", "login"));
   }
   @Test 
   public void aa() {
	   elementClick(findingElement("xpath", "//a[text()='Forgotten password?']"));
   }
   @Test
   public void bb() {
	   elementClick(findingElement("xpath", "//a[text()='Create new account']"));
   }
   @Test
   public void cc() {
	   elementClick(findingElement("xpath", "//a[text()='Create a Page']"));
   }
   @Test
   public void dd() {
	   elementClick(findingElement("xpath", "//img[@alt='Facebook']"));
   }
   @After
   public void after() throws IOException {
	   screenShot();
   }
   @AfterClass
   public static void afterClass() {
	   quitBrowser();
   }
	
	
	

}
