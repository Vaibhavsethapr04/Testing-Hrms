import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Augurs\\Documents\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.testing-hrms.augurstechnologies.com/");
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
	//driver.get("https://www.google.com/");
	//driver.navigate().back();
	//driver.close();
	//driver.quit();
	driver.findElement(By.name("email")).sendKeys("testinghrms@gmail.com");
	driver.findElement(By.name("password")).sendKeys("12345678");
	driver.findElement(By.id("kt_login_signin_submit")).click();
	driver.findElement(By.className("kt-menu__link-text")).click();
	}
	

}
