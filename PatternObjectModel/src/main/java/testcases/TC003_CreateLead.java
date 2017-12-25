package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_CreateLead";
		testDescription = "This testcase is used to create a lead";
		category= "Smoke";
		authors	="Nithya";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord, String cName, String fName, String lName, String src, String mrkt) {

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickLinkCRM()
		.clickLead()
		.clickCreLead()
		.enterCompName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterSource(src)
		.enterMarket(mrkt)
		.clickCreateLeadBtn()
		.verifyCompanyName(cName);




	}

}
