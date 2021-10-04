import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class seleniumfirstffd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver","C:\\selenium webdriver and selenium java client\\geckodriver-v0.30.0-win64\\geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver(); 
        driver.get("http://google.com");
        driver.close();*/
		
		// Creating a new instance of the HTML unit driver
        WebDriver driver = new HtmlUnitDriver();
        System.out.println("driver is: " + driver);
        // Navigate to Google		
        driver.get("http://www.yahoo.com");					
        // This code will print the page title and current url		 
        System.out.println("Page title is: " + driver.getTitle());		
        System.out.println("Current Url is: " + driver.getCurrentUrl());	
        driver.quit();
	}

}


