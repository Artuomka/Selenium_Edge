import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Complex_Tests {

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
	public void test_complex() 
	{

	
	String exp = "1111111111";
	for (int i = 0; i<10; i++) {
	drv.findElement(ById.id("num1")).click();
	}
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	

	assertEquals (exp, act);
	
	//drv.close();
	
	}
	
	@Test
	public void test_complex2() 
	{
	
	String exp = "2222222222";
	for (int i = 0; i<10; i++) {
	drv.findElement(ById.id("num2")).click();
	}
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	

	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex0() 
	{
	
	String exp = "0";
	for (int i = 0; i<10; i++) {
	drv.findElement(ById.id("num0")).click();
	}
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex3() 
	{
	
	String exp = "3333333333";
	for (int i = 0; i<10; i++) {
	drv.findElement(ById.id("num3")).click();
	}
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	

	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex4() 
	{
	
	String exp = "4444444444";
	for (int i = 0; i<10; i++) {
	drv.findElement(ById.id("num4")).click();
	}
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex5() 
	{
	
	String exp = "5555555555";
	for (int i = 0; i<10; i++) {
	drv.findElement(ById.id("num5")).click();
	}
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex6() 
	{
	
	String exp = "6666666666";
	for (int i = 0; i<10; i++) {
	drv.findElement(ById.id("num6")).click();
	}
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex7() 
	{
	
	String exp = "7777777777";
	for (int i = 0; i<10; i++) {
	drv.findElement(ById.id("num7")).click();
	}
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex8() 
	{
	
	String exp = "8888888888";
	for (int i = 0; i<10; i++) {
	drv.findElement(ById.id("num8")).click();
	}
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex9() 
	{
	
	String exp = "9999999999";
	for (int i = 0; i<10; i++) {
	drv.findElement(ById.id("num9")).click();
	}
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_complex91() 
	{
	
	String exp = "99999999991111111111";
	for (int i = 0; i<10; i++) 
	{
	drv.findElement(ById.id("num9")).click();
	}
	for (int i = 0; i<10; i++) 
	{
	drv.findElement(ById.id("num1")).click();
	}
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_complex19() 
	{
	
	String exp = "11111111119999999999";
	for (int i = 0; i<10; i++) 
	{
	drv.findElement(ById.id("num1")).click();
	}
	for (int i = 0; i<10; i++) 
	{
	drv.findElement(ById.id("num9")).click();
	}
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_complex11() 
	{
	
	String exp = "199199";
	for (int i = 0; i<2; i++) 
	{
	drv.findElement(ById.id("num1")).click();
	for (int j = 0; j<2; j++) 
	{
	drv.findElement(ById.id("num9")).click();
	}
	}
	
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_complex12() 
	{
	
	String exp = "288288";
	for (int i = 0; i<2; i++) 
	{
	drv.findElement(ById.id("num2")).click();
	for (int j = 0; j<2; j++) 
	{
	drv.findElement(ById.id("num8")).click();
	}
	}
	
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_complex13() 
	{
	
	String exp = "344434443444";
	for (int i = 0; i<3; i++) 
	{
	drv.findElement(ById.id("num3")).click();
	for (int j = 0; j<3; j++) 
	{
	drv.findElement(ById.id("num4")).click();
	}
	}
	
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_complex14() 
	{
	
	String exp = "344434443444";
	for (int i = 0; i<3; i++) 
	{
	drv.findElement(ById.id("num3")).click();
	for (int j = 0; j<3; j++) 
	{
	drv.findElement(ById.id("num4")).click();
	}
	}
	
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_complex15() 
	{
	
	String exp = "155515551555";
	for (int i = 0; i<3; i++) 
	{
	drv.findElement(ById.id("num1")).click();
	for (int j = 0; j<3; j++) 
	{
	drv.findElement(ById.id("num5")).click();
	}
	}
	
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_complex16() 
	{
	
	String exp = "799979997999";
	for (int i = 0; i<3; i++) 
	{
	drv.findElement(ById.id("num7")).click();
	for (int j = 0; j<3; j++) 
	{
	drv.findElement(ById.id("num9")).click();
	}
	}
	
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_complex17() 
	{
	
	String exp = "477747774777";
	for (int i = 0; i<3; i++) 
	{
	drv.findElement(ById.id("num4")).click();
	for (int j = 0; j<3; j++) 
	{
	drv.findElement(ById.id("num7")).click();
	}
	}
	
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_complex18() 
	{
	
	String exp = "677767776777";
	for (int i = 0; i<3; i++) 
	{
	drv.findElement(ById.id("num6")).click();
	for (int j = 0; j<3; j++) 
	{
	drv.findElement(ById.id("num7")).click();
	}
	}
	
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_complex20() 
	{
	
	String exp = "422422";
	for (int i = 0; i<2; i++) 
	{
	drv.findElement(ById.id("num4")).click();
	for (int j = 0; j<2; j++) 
	{
	drv.findElement(ById.id("num2")).click();
	}
	}
	
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
	
	}
	
	@Test
	public void test_complex21() 
	{
	
	String exp = "123";
	
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num3")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	

	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex22() 
	{
	
	String exp = "321";
	
	drv.findElement(ById.id("num3")).click();
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num1")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex23() 
	{
	
	String exp = "1568";
	
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("num6")).click();
	drv.findElement(ById.id("num8")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex24() 
	{
	
	String exp = "1486";
	
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num8")).click();
	drv.findElement(ById.id("num6")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex25() 
	{
	
	String exp = "7327";
	
	drv.findElement(ById.id("num7")).click();
	drv.findElement(ById.id("num3")).click();
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num7")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex26() 
	{
	
	String exp = "8478";
	
	drv.findElement(ById.id("num8")).click();
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num7")).click();
	drv.findElement(ById.id("num8")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex27() 
	{
	
	String exp = "4523";
	
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num3")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex28() 
	{
	
	String exp = "6251";
	
	drv.findElement(ById.id("num6")).click();
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("num1")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex29() 
	{
	
	String exp = "84391";
	
	drv.findElement(ById.id("num8")).click();
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num3")).click();
	drv.findElement(ById.id("num9")).click();
	drv.findElement(ById.id("num1")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex30() 
	{
	
	String exp = "90351";
	
	drv.findElement(ById.id("num9")).click();
	drv.findElement(ById.id("num0")).click();
	drv.findElement(ById.id("num3")).click();
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("num1")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex31() 
	{
	
	String exp = "47101";
	
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num7")).click();
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num0")).click();
	drv.findElement(ById.id("num1")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex32() 
	{
	
	String exp = "58941";
	
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("num8")).click();
	drv.findElement(ById.id("num9")).click();
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num1")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex33() 
	{
	
	String exp = "53019";
	
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("num3")).click();
	drv.findElement(ById.id("num0")).click();
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num9")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex34() 
	{
	
	String exp = "44137";
	
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num3")).click();
	drv.findElement(ById.id("num7")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex35() 
	{
	
	String exp = "51247";
	
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num7")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex36() 
	{
	
	String exp = "87421";
	
	drv.findElement(ById.id("num8")).click();
	drv.findElement(ById.id("num7")).click();
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num1")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex37() 
	{
	
	String exp = "545189";
	
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num8")).click();
	drv.findElement(ById.id("num9")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex38() 
	{
	
	String exp = "212890";
	
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num8")).click();
	drv.findElement(ById.id("num9")).click();
	drv.findElement(ById.id("num0")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex39() 
	{
	
	String exp = "234754";
	
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num3")).click();
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num7")).click();
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("num4")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex40() 
	{
	
	String exp = "210689";
	
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num0")).click();
	drv.findElement(ById.id("num6")).click();
	drv.findElement(ById.id("num8")).click();
	drv.findElement(ById.id("num9")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex41() 
	{
	
	String exp = "123789";
	
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num3")).click();
	drv.findElement(ById.id("num7")).click();
	drv.findElement(ById.id("num8")).click();
	drv.findElement(ById.id("num9")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex42() 
	{
	
	String exp = "789123";
	
	drv.findElement(ById.id("num7")).click();
	drv.findElement(ById.id("num8")).click();
	drv.findElement(ById.id("num9")).click();
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num3")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex43() 
	{
	
	String exp = "852963";
	
	drv.findElement(ById.id("num8")).click();
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num9")).click();
	drv.findElement(ById.id("num6")).click();
	drv.findElement(ById.id("num3")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex44() 
	{
	
	String exp = "741951";
	
	drv.findElement(ById.id("num7")).click();
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num9")).click();
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("num1")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex45() 
	{
	
	String exp = "487632";
	
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num8")).click();
	drv.findElement(ById.id("num7")).click();
	drv.findElement(ById.id("num6")).click();
	drv.findElement(ById.id("num3")).click();
	drv.findElement(ById.id("num2")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex46() 
	{
	
	String exp = "856452";
	
	drv.findElement(ById.id("num8")).click();
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("num6")).click();
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("num2")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex47() 
	{
	
	String exp = "165780";
	
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num6")).click();
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("num7")).click();
	drv.findElement(ById.id("num8")).click();
	drv.findElement(ById.id("num0")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex48() 
	{
	
	String exp = "654963";
	
	drv.findElement(ById.id("num6")).click();
	drv.findElement(ById.id("num5")).click();
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num9")).click();
	drv.findElement(ById.id("num6")).click();
	drv.findElement(ById.id("num3")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex49() 
	{
	
	String exp = "149932";
	
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num9")).click();
	drv.findElement(ById.id("num9")).click();
	drv.findElement(ById.id("num3")).click();
	drv.findElement(ById.id("num2")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
	
	@Test
	public void test_complex50() 
	{
	
	String exp = "320147";
	
	drv.findElement(ById.id("num3")).click();
	drv.findElement(ById.id("num2")).click();
	drv.findElement(ById.id("num0")).click();
	drv.findElement(ById.id("num1")).click();
	drv.findElement(ById.id("num4")).click();
	drv.findElement(ById.id("num7")).click();
	String act = drv.findElement(ById.id("res")).getAttribute("value");
	
	assertEquals (exp, act);
		
	}
}