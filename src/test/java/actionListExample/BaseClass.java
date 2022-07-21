package actionListExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	Actions act;
	
	
	@BeforeTest
	public void launchsite() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.get("https://jqueryui.com/droppable/");
		//driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/support/ui/Select.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    Thread.sleep(1000);
	    
	    act = new Actions(driver);
	
		
	}
	
	@AfterTest
	public void closesite() {
		driver.close();
	}

}
