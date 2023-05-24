package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.ExcelReader;

public class DepositPage {
	WebDriver driver = DriverFactory.getdriver();
	String depositpage = ConfigReader.getDepositPage();
	ExcelReader excelReaderUtil;
	public DepositPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='accountno']")
	@CacheLookup
	WebElement txtAccountNO;
	@FindBy(xpath = "//label[@name='balance']")
	@CacheLookup
	WebElement txtAmount;
	@FindBy(xpath = "//input[@name='desc']")
	@CacheLookup
	WebElement textDescription;
	@FindBy(xpath = "//label[@id='message2']")
	@CacheLookup
	WebElement txtAccErrorMsg;
	@FindBy(xpath = "//label[@id='message15']")
	@CacheLookup
	WebElement txtAmountErrorMsg;
	@FindBy(xpath = "//label[@id='message17']")
	@CacheLookup
	WebElement txtDescErrorMsg;

	
}
