import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_RealJob_Tests {

	private static WebDriver drv;
	
	@BeforeClass
	
	public static void startDriver()
	{
		System.setProperty("webdriver.edge.driver", "D:/MicrosoftWebDriver.exe");
		 drv = new EdgeDriver();
		
		drv.get("file:///D:/calc.html");
	}
	
	@AfterClass
	public static void stopDriver()
	{
		drv.quit();
	}
	
	@Before
	
	public void refresh()
	{
		drv.navigate().refresh();
		drv.navigate().refresh();
	}

	@Test
	public void test_plus_job() 
	{

	
	String exp = "123";
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num0")).click();
	drv.findElement(ById.id("num0")).click();
	drv.findElement(ById.id("plus")).click();
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num3")).click();
	drv.findElement(ById.id("result")).click();
	String act  = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	
	
	
	}
	
	@Test
	public void test_minus_job() 
	{

	
	String exp = "100";
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num9")).click();
	drv.findElement(ById.id("num9")).click();
	drv.findElement(ById.id("minus")).click();
	drv.findElement(ById.id("num9")).click();
	drv.findElement(ById.id("num9")).click();
	drv.findElement(ById.id("result")).click();
	String act  = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_mult_job() 
	{

	
	String exp = "144";
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("mult")).click();
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("result")).click();
	String act  = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_div_job() 
	{

	
	String exp = "5";
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("div")).click();
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("result")).click();
	String act  = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
}