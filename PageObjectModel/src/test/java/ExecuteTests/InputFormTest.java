package ExecuteTests;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.DatePickersPage;
import Pages.InputFormPage;

public class InputFormTest extends BaseClass
{
	InputFormPage inputformpage;
	
	@Test
	public void VerifyStates()
	{
		inputformpage=new InputFormPage(driver);
		inputformpage.clickOnInputForm();
		inputformpage.clickOnjquery_select();
		inputformpage.selectState("California");
		
		
	}

}////span[text()='California']
