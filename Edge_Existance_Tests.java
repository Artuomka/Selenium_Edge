import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Existance_Tests {

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
	}
	
	@Test
	public void test_1() 
	{
		
	String exp = drv.findElement(ById.id("num1")).getAttribute("value");
	String act = "1";
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_2() 
	{
		
	String exp = drv.findElement(ById.id("num2")).getAttribute("value");
	String act = "2";

	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_3() 
	{
	
	String exp = drv.findElement(ById.id("num3")).getAttribute("value");
	String act = "3";

	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_4() 
	{
	
	String exp = drv.findElement(ById.id("num4")).getAttribute("value");
	String act = "4";
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_5() 
	{
	
	String exp = drv.findElement(ById.id("num5")).getAttribute("value");
	String act = "5";
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_6() 
	{
	
	String exp = drv.findElement(ById.id("num6")).getAttribute("value");
	String act = "6";
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_7() 
	{
	
	String exp = drv.findElement(ById.id("num7")).getAttribute("value");
	String act = "7";
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_8() 
	{
	
	String exp = drv.findElement(ById.id("num8")).getAttribute("value");
	String act = "8";
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_9() 
	{
	
	String exp = drv.findElement(ById.id("num9")).getAttribute("value");
	String act = "9";
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_0() 
	{
	
	String exp = drv.findElement(ById.id("num0")).getAttribute("value");
	String act = "0";
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_plus() 
	{
	
		String exp = drv.findElement(ById.id("plus")).getAttribute("value");
		String act = "+";
		
		assertEquals (exp, act);
	
	}
	
	@Test
	public void test_minus() 
	{
	
		String exp = drv.findElement(ById.id("minus")).getAttribute("value");
		String act = "-";
		
		assertEquals (exp, act);
		
	}
	
	@Test
	public void test_mult() 
	{

		String exp = drv.findElement(ById.id("mult")).getAttribute("value");
		String act = "*";
		
		assertEquals (exp, act);
		
	assertEquals (exp, act);
	}
	
	@Test
	public void test_div() 
	{
	
		String exp = drv.findElement(ById.id("div")).getAttribute("value");
		String act = "/";
		
		assertEquals (exp, act);
		
	}
	
	@Test
	public void test_equal() 
	{
	
		String exp = drv.findElement(ById.id("result")).getAttribute("value");
		String act = "=";
		
		assertEquals (exp, act);
		
	}

}
