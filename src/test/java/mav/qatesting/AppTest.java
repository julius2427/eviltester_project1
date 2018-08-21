package mav.qatesting;

import java.net.URISyntaxException;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import commonfunctions.AbstractSteps;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest extends AbstractSteps
{
	WebDriver driver = getDriver();

	@Before
		public void test1() throws URISyntaxException {
			
		}
	
	@Test
		public void test2() throws Exception
	    {
		
	    }
	
	
	@Test
		public void test3() throws Exception
		{
		
		}
		
	@After
		public void closeapp() {
			driver.quit();
		}
	
}
