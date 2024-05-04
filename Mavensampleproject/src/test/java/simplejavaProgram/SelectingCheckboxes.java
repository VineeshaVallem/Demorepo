package simplejavaProgram;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingCheckboxes {

	public static void main(String[] args) {
		//1)select all checkboxes

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		List <WebElement> checkbox= driver.findElements(By.xpath("//input[@name='language']"));
		
		System.out.println(checkbox.size());
		for(int i=0; i<=checkbox.size(); i++) {
			checkbox.get(i).click();
			
		}
	

	}

}
