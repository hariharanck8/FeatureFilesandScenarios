package login_Test_StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Test1_Steps {

	public static WebDriver driver;

//	public static WebDriver driver;
//	
//	@Given("^User is on Home Page$")
//	public void user_is_on_Home_Page() throws Throwable {
//		
//		driver = new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	    
//	    driver.get("https://demoqa.com/login");
//	    driver.manage().window().maximize();
//	    
//	}
//
//	@When("^User enters UserName and Password$")
//	public void user_enters_UserName_and_Password() throws Throwable {
//		
//		driver.findElement(By.id("userName")).sendKeys("santhoshg"); 	
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//	    driver.findElement(By.id("password")).sendKeys("Vishu@23");
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	    
//	    driver.findElement(By.xpath("//*[@id='login']")).click();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	}
//
//	@Then("^Message displayed Login Successfully$")
//	public void message_displayed_Login_Successfully() throws Throwable {
//		System.out.println("user Logged Successfully");
//	}
//
//	@When("^User LogOut from the Application$")
//	public void user_LogOut_from_the_Application() throws Throwable {
//		
//		driver.findElement (By.xpath("//*[@id='submit']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	}
//
//	@Then("^Message displayed LogOut Successfully$")
//	public void message_displayed_LogOut_Successfully() throws Throwable {
//		System.out.println("user Loggged out Successfully");
//		driver.quit();
//	}
//	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/login");
	}

	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_UserName_and_Password(String username, String password) throws Throwable {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("userName")).sendKeys(username); 	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("password")).sendKeys(password);

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		WebElement login_click = wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
		login_click.click();

	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}

}
