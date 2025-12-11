package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class HomePageValidation extends BaseClass {

	public HomePageValidation(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "fname")
	WebElement fnamElement;
	@FindBy(id = "lname")
	WebElement lnamElement;
	@FindBy(id = "email")
	WebElement emailElement;
	@FindBy(id = "password")
	WebElement passElement;
	@FindBy(id = "male")
	WebElement genderElement;
	@FindBy(id = "Present-Address")
	WebElement localadressElement;
	@FindBy(id = "Permanent-Address")
	WebElement PermanetadressElement;
	@FindBy(id = "male")
	WebElement maleRadobtnElement;
	@FindBy(xpath = "//span[@id='select2-Skills-container']")
	WebElement skillsElement;
	@FindBy(xpath = "//li[.='Technical Skills']")
	WebElement choseSkillElement;

	@FindBy(id = "Pincode")
	WebElement pincodElement;

	@FindBy(css = "#chat-bot-launcher-button")
	WebElement popupElement;
	@FindBy(css = "#chat-bot-widget-close")
	WebElement crossElement;

	public void FormTextBox(String fname, String lname, String email, String pass, String adress, String code) {
		ElementVisble(fnamElement);
		fnamElement.sendKeys(fname);

		ElementVisble(lnamElement);
		lnamElement.sendKeys(lname);

		ElementVisble(emailElement);
		emailElement.sendKeys(email);

		ElementVisble(passElement);
		passElement.sendKeys(pass);

		ElementVisble(localadressElement);
		localadressElement.sendKeys(adress);

		ElementVisble(PermanetadressElement);
		PermanetadressElement.sendKeys(adress);

		popupElement.click();
		ElementClickable(crossElement);

		skillsElement.click();
		ElementClickable(choseSkillElement);

		pincodElement.sendKeys(code);

	}

	@FindBy(xpath = "//span[@id='select2-technicalskills-container']")
	WebElement courceElement;

	@FindBy(xpath = "//li[.='Manual Testing']")
	WebElement nonTecnicalElement;

	public void DropDown() {
		courceElement.click();
		ElementVisble(nonTecnicalElement);
		nonTecnicalElement.click();
	}

	@FindBy(xpath = "//input[@id='file']")
	WebElement filElement;
	@FindBy(xpath = "//button[@name='Submit']")
	WebElement submitElement;

	public void FileUpload() {
		scrollToElement(filElement);
		filElement.sendKeys("D:\\Practice_Excel.xlsx");
	}

	@FindBy(xpath = "//input[@id='male']")
	WebElement malebtnElement;
	@FindBy(xpath = "//input[@id='relocate']")
	WebElement relocateElement;

	public void RadioBtn() {
		scrollToElement(maleRadobtnElement);
		malebtnElement.click();
	}

	public void relocatebtn() {
		scrollToElement(relocateElement);

		ElementClickable(relocateElement);
		ElementClickable(submitElement);
		}
	
	public String waitForAlert() {
	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert = driver.switchTo().alert();
	    String msg=alert.getText();
	    alert.accept();
	    return msg;
	   
	}

	

}
