package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);				
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCName;	
	public CreateLeadPage enterCompName(String cName) {
		type(eleCName, cName);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFName;
	public CreateLeadPage enterFirstName(String fName) {
		type(eleFName, fName);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLName;
	public CreateLeadPage enterLastName(String lName) {
		type(eleLName, lName);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	private WebElement eleSrc;
	public CreateLeadPage enterSource(String src) {
		selectDropDownUsingText(eleSrc, src);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_marketingCampaignId")
	private WebElement eleMarket;
	public CreateLeadPage enterMarket(String mrkt) {
		selectDropDownUsingText(eleMarket, mrkt);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstNameLocal")
	private WebElement elefNameLoc;
	public CreateLeadPage enterFirstNameLocal(String fname) {
		type(elefNameLoc, fname);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastNameLocal")
	private WebElement elelNameLoc;
	public CreateLeadPage enterLastNameLocal(String lname) {
		type(elelNameLoc, lname);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_personalTitle")
	private WebElement eleSalute;
	public CreateLeadPage enterSalutation(String sal) {
		type(eleSalute, sal);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_generalProfTitle")
	private WebElement eleTitle;
	public CreateLeadPage enterTitle(String title) {
		type(eleTitle, title);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_departmentName")
	private WebElement eleDept;
	public CreateLeadPage enterDeptName(String dep) {
		type(eleDept, dep);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_annualRevenue")
	private WebElement eleRevenue;
	public CreateLeadPage enterRevenue(String rev) {
		type(eleMarket, rev);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_currencyUomId")
	private WebElement eleCurrency;
	public CreateLeadPage selectCurrency(String curr) {
		selectDropDownUsingText(eleCurrency, curr);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_industryEnumId")
	private WebElement eleIndustry;
	public CreateLeadPage selectIndustry(String indus) {
		selectDropDownUsingText(eleIndustry, indus);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_numberEmployees")
	private WebElement elenofemp;
	public CreateLeadPage enterNoOfEmp(String emp) {
		type(elenofemp, emp);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_ownershipEnumId")
	private WebElement eleownEnum;
	public CreateLeadPage selectOwnershipNo(String own) {
		selectDropDownUsingText(eleownEnum, own);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_sicCode")
	private WebElement eleSicCode;
	public CreateLeadPage enterSicode(String sic) {
		type(eleSicCode, sic);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_tickerSymbol")
	private WebElement eleTicker;
	public CreateLeadPage enterTicker(String ticker) {
		type(eleTicker, ticker);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_description")
	private WebElement eleDescp;
	public CreateLeadPage enterDescription(String desc) {
		type(eleDescp, desc);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_importantNote")
	private WebElement eleimport;
	public CreateLeadPage enterImportantNote(String imp) {
		type(eleimport, imp);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmail;
	public CreateLeadPage enterEmail(String email) {
		type(eleEmail, email);
		return this;		
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadBtn;
	public ViewLeadPage clickCreateLeadBtn() {
		click(eleCreateLeadBtn);
		return new ViewLeadPage(driver, test);
	}
	
	
	
	
	
	
	
	
	
	
	

}
