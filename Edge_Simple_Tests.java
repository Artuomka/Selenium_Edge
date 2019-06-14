import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Simple_Tests {

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
	public void test_1() 
	{
	
	
	String exp = "1";
	drv.findElement(ById.id("num1")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	
	//drv.close();
	
	}
	
	@Test
	public void test_2() 
	{
	
	
	String exp = "2";
	drv.findElement(ById.id("num2")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	
	//drv.close();
	
	}
	
	@Test
	public void test_3() 
	{
	
	
	String exp = "3";
	drv.findElement(ById.id("num3")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	

	
	}
	
	@Test
	public void test_4() 
	{
	
	
	String exp = "4";
	drv.findElement(ById.id("num4")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	

	
	}
	
	@Test
	public void test_5() 
	{
	
	
	String exp = "5";
	drv.findElement(ById.id("num5")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	

	
	}
	
	@Test
	public void test_6() 
	{
	
	
	String exp = "6";
	drv.findElement(ById.id("num6")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	}
		
	@Test
	public void test_7() 
	{
	
	
	String exp = "7";
	drv.findElement(ById.id("num7")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	}
	
	@Test
	public void test_8() 
	{
	
	
	String exp = "8";
	drv.findElement(ById.id("num8")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	}
	
	@Test
	public void test_9() 
	{
	
	
	String exp = "9";
	drv.findElement(ById.id("num9")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	}
	
	@Test
	public void test_0() 
	{
	
	
	String exp = "0";
	drv.findElement(ById.id("num0")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	}
	
	@Test
	public void test_plus() 
	{

	
	String exp = "+";
	drv.findElement(ById.id("plus")).click();
	String act  = drv.findElement(ById.id("oper")).getAttribute("value");
	
	assertEquals (exp, act);
	
	
	
	}
	
	@Test
	public void test_minus() 
	{

	
	String exp = "-";
	drv.findElement(ById.id("minus")).click();
	String act  = drv.findElement(ById.id("oper")).getAttribute("value");
	
	assertEquals (exp, act);
	
	
	
	}
	
	@Test
	public void test_mult() 
	{

	
		String exp = "*";
		drv.findElement(ById.id("mult")).click();
		String act  = drv.findElement(ById.id("oper")).getAttribute("value");
		
		assertEquals (exp, act);
				
	}
	@Test
	public void test_div() 
	{
	
		String exp = "/";
		drv.findElement(ById.id("div")).click();
		String act  = drv.findElement(ById.id("oper")).getAttribute("value");
		
		assertEquals (exp, act);
		
	}
	
	@Test
	public void test_equal() 
	{
	
		String exp = "=";
		drv.findElement(ById.id("result")).click();
		String act  = drv.findElement(ById.id("oper")).getAttribute("value");
		
		assertEquals (exp, act);
		
	}
}