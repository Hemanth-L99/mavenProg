package seleniumprog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class home {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lanka\\Desktop\\selenium jars\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("www.google.com");
}
}