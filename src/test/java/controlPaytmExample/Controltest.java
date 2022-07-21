package controlPaytmExample;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Controltest extends BaseClass{
	
	@Test
	public void verifysignin() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		String headingText = driver.findElement(By.cssSelector(".heading")).getText();
		System.out.println(headingText);
		Assert.assertTrue(headingText.contains("your Paytm Web"));
		driver.findElement(By.xpath("//span[contains(text(),'Watch Video')]")).click();
	}

}
