package Java_P001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_setting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		String Title=driver.getTitle();
		System.out.println(Title);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		
		
		

		
	}

}
