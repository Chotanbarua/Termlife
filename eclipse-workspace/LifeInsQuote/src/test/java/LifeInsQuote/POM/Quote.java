package LifeInsQuote.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quote {
	
	WebDriver driver;
	
	public Quote(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
//		Alert alt = driver.switchTo().alert();
//		alt.dismiss();
	}
	
	
	@FindBy(xpath="//input[@id='zip']")
	WebElement zip;
	
	public WebElement zipcode() {
	 return zip;
 }
	@FindBy(xpath="//*[@id='gender']")
	WebElement Gend;
	
	public WebElement Gender() {
		return Gend;
	}
	@FindBy(xpath="//SELECT[@id='month']")
	WebElement MM;
	
	public WebElement Month() {
		return MM;
	}
	@FindBy(xpath="//SELECT[@id='day']")
	WebElement DD;
	
	public WebElement Day() {
		return DD;
	}
	@FindBy(xpath="//SELECT[@id='year']")
	WebElement YY;
	
	public WebElement Year() {
		return YY;
	}
	@FindBy(xpath="//*[@id='isMemberNo']")
	WebElement Member;
	
	public WebElement Membership() {
		return Member;
	}
	
	@FindBy(xpath="//*[@id='contact_email']")
	WebElement email;
	
	public WebElement emailaddress() {
		return email;
	}
	@FindBy(xpath="//*[@id='feet']")
	WebElement HF;
	
	public WebElement HFoot() {
		return HF;
	}
	@FindBy(xpath="//*[@id='inches']")
	WebElement HI;
	
	public WebElement HInch() {
		return HI;
	}
	@FindBy(xpath="//*[@id='weight']")
	WebElement WT;
	
	public WebElement Weight() {
		return WT;
	}
	@FindBy(xpath="//*[@id='nicotineUseNo']")
	WebElement Nicotine;
	
	public WebElement NicotineUse() {
		return Nicotine;
	}
	@FindBy(xpath="//*[@id='rateYourHealth']")
	WebElement Hrate;
	
	public WebElement HealthRate() {
		return Hrate;
	}
	
	@FindBy(xpath="//*[@id='coverageAmount']")
	WebElement CVG;
	
	public WebElement CoverageAmnt() {
		return CVG;
	}
	@FindBy(xpath="//*[@id='termLength']")
	WebElement Term;
	
	public WebElement TermLength() {
		return Term;
	}
	@FindBy(xpath="//*[@id='termLength']")
	WebElement Submit;
	
	public WebElement SeeyourQuote() {
		return Submit;
	}
}
