package LifeInsQuote.stefdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import LifeInsQuote.POM.Quote;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Life_Ins_Quote {
	WebDriver driver;
    Quote LifeIns = new Quote(driver);
    
	 @Given("^User Get Traditonal Term Quote page$")
	 public void user_Get_Traditonal_Term_Quote_page() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver", "C:\\Webdriver\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();*/
		driver.get("https://www.aaalife.com/term-life-insurance-quote-input");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	 }
	 
	 @When("^User enters Zip Code$")
	 public void user_enters_Zip_Code() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		 Quote LifeIns = new Quote(driver);
		 driver.navigate().refresh();
		 LifeIns.zipcode().clear();
		 WebDriverWait wait = new WebDriverWait (driver, 30);
	     LifeIns.zipcode().sendKeys("32803");
	     WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='tel']")));
	     element.sendKeys("32803"); 
	 
	 }

	 @When("^User Select Gender$")
	 public void user_Select_Gender() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		 Quote LifeIns = new Quote(driver);
		 LifeIns.Gender().click();
		 Select G = new Select(LifeIns.Gender());
		 G.selectByVisibleText("Male");
		
	 }

	 @When("^User Select Dob$")
	 public void user_Select_Dob() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		 /*Quote LifeIns = new Quote(driver);
		 Select M = new Select(LifeIns.Month());
		 M.selectByValue("1");
		 Select D = new Select(LifeIns.Day());
		 D.selectByValue("15");
		 Select Y = new Select(LifeIns.Year());
		 Y.selectByValue("1985");*/
	    
	 }

	 @When("^User Select AAA membership$")
	 public void user_Select_AAA_membership() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		 /*Quote LifeIns = new Quote(driver);
		 LifeIns.Membership().click();	
			 System.out.println("Membership slection is" + LifeIns.Membership().isSelected());*/
		
	 }

	 @When("^User Enters Email$")
	 public void user_Enters_Email() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		/* Quote LifeIns = new Quote(driver);
		 LifeIns.emailaddress().sendKeys("rockryanworld@gmail.com");*/
	 }

	 @When("^User Select Height$")
	 public void user_Select_Height() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		 /*Quote LifeIns = new Quote(driver);
		 LifeIns.HFoot().click();
		 Select foot = new Select(LifeIns.HFoot());
		 foot.selectByValue("5");
		 LifeIns.HInch().click();
		 Select inch = new Select(LifeIns.HInch());
		 inch.selectByValue("8");*/
	 }

	 @When("^User Enters Weight$")
	 public void user_Enters_Weight() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		/* Quote LifeIns = new Quote(driver);
		 LifeIns.Weight().sendKeys("155");*/
	 }

	 @When("^User Select Nicotine Last use$")
	 public void user_Select_Nicotine_Last_use() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		/* Quote LifeIns = new Quote(driver);
		 LifeIns.NicotineUse().click();
		 System.out.println("Membership slection is" + LifeIns.NicotineUse().isSelected());*/
	 }

	 @When("^User Select Rate Your Health$")
	 public void user_Select_Rate_Your_Health() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		/* Quote LifeIns = new Quote(driver);
		 LifeIns.HealthRate().click();
		 Select rate = new Select(LifeIns.HealthRate());
		 rate.selectByValue("good");*/
	 }

	 @When("^User Select Coverage Amount$")
	 public void user_Select_Coverage_Amount() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		/* Quote LifeIns = new Quote(driver);
		 LifeIns.CoverageAmnt().click();
		 Select CAMNT = new Select(LifeIns.CoverageAmnt());
		 CAMNT.selectByValue("350,000");*/
	 }

	 @When("^User Select Term Length$")
	 public void user_Select_Term_Length() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		 /*Quote LifeIns = new Quote(driver);
		 LifeIns.TermLength().click();
		 Select TL  = new Select(LifeIns.TermLength());
		 TL.selectByValue("25");*/
	 }

	 @When("^User Click on See Your Quote Button$")
	 public void user_Click_on_See_Your_Quote_Button() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		 /*Quote LifeIns = new Quote(driver);
		 LifeIns.SeeyourQuote().submit();*/
	 }

	 @Then("^User lands on Quote Results page\\.$")
	 public void user_lands_on_Quote_Results_page() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		
		/* String Atitle = driver.getTitle();
		 System.out.println(Atitle);
		 driver.close(); 
	 }*/

	 }
}
