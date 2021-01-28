package mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytest01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\My Documents\\Sagar Study\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

	}

}
