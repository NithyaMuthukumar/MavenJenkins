package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleCompanyName;
	public ViewLeadPage verifyCompanyName(String compName) {
		verifyPartialText(eleCompanyName, compName);
		return this;
	}
	
	
	
	public ViewLeadPage verifyTitleofPageCompanyName(String title) {
		verifyTitle(title);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Edit']")
	private WebElement eleEditBtn;
	public EditLeadPage clickEdit(){
		click(eleEditBtn);
		return new EditLeadPage(driver,test);
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Duplicate Lead']")
	private WebElement eleDupBtn;
	public EditLeadPage clickDuplicate(){
		click(eleDupBtn);
		return new EditLeadPage(driver,test);
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Delete']")
	private WebElement eleDelBtn;
	public EditLeadPage clickDelete(){
		click(eleDelBtn);
		return new EditLeadPage(driver,test);
	}
	
	
	
	
	
	

}
