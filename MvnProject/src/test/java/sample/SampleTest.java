package sample;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

import com.app.genericlib.MakteMytripGenericlib;

public class SampleTest {
	
	@Test
	public void bookTicket(XmlTest xmlObj) {

	        
	        WebDriver driver = new FirefoxDriver();
	        driver.get("https://www.makemytrip.com/flights");
	        
	        driver.findElement(By.linkText("Flights")).click();
	        
	        //Click on Departure
	        driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
	        

	        MakteMytripGenericlib m = new MakteMytripGenericlib();
	        m.handleCalenderwindow(driver, "25", "Feb", "2021");
	      
	
	        
	}
	

}
