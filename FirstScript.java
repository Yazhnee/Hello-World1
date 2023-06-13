package day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set the path of executable browser driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Yazhnee\\Technical_Workbook\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//WebDriver- Parent & ChromeDriver-Child
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());//Printing title
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma shoes for women");//id taken from Amazon xml page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/*
		 * synchronized (driver) {
		 * 
		 * try { driver.manage().timeouts().wait(10000); } catch (InterruptedException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); } //10
		 * seconds=10000 milliseconds } //driver.manage().timeouts().implicitlyWait(30,
		 * TimeUnit.SECONDS);
		 */		driver.quit();
	}

	/*
	 * @Override public void run() { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
