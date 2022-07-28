package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SplashPage extends TestBase{

	@FindBy(className="modal-close")
	public WebElement closePrivacyPopupButton;
	
	@FindBy(xpath="(//button[contains(@class,'getStartedBtn')])[1]")
	public WebElement letsGetStarted;
	
	public SplashPage() {
		PageFactory.initElements(driver, this);
	}
}