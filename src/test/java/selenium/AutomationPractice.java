package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice {

	public static void main(String[] args) {
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://www.techlistic.com/p/selenium-practice-form.html" );
		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chromedriver.manage().window().maximize();
		WebElement firstname=chromedriver.findElement(By.name("firstname"));
		firstname.click();
		firstname.sendKeys("geetha");	
		WebElement lastname =chromedriver.findElement(By.name("lastname"));
		lastname.click();
		lastname.sendKeys("angu");
		WebElement gender = chromedriver.findElement(By.id("sex-0"));
		gender.click();
	   WebElement exp  = chromedriver.findElement(By.id("exp-1"));	
	   exp.click();
	WebElement date1 = chromedriver.findElement(By.id("datepicker"));	
	date1.sendKeys("4/6/2023");	
			WebElement prof = chromedriver.findElement(By.id("profession-1"));	
			prof.click();
			WebElement tool = chromedriver.findElement(By.id("tool-2"));	
			tool.click();
		
			WebElement cont = chromedriver.findElement(By.id("continents"));	
			cont.click();
			Select cont1 = new Select(chromedriver.findElement(By.id("continents")));
			cont1.selectByVisibleText("Asia");
			
			
			WebElement commands = chromedriver.findElement(By.id("selenium_commands"));	
			commands.click();
			Select comm = new Select(chromedriver.findElement(By.id("selenium_commands")));
			cont1.selectByVisibleText("Browser Commands");
			
		
			WebElement submit = chromedriver.findElement(By.id("submit"));	
			submit.click();
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
