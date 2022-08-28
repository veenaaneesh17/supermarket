package ExecuteTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.DatePickersPage;

public class DatePickersTest extends BaseClass {
	
DatePickersPage datepickerspage;
	
	
@Test
public void verifyDatePicker() {
	
	datepickerspage=new DatePickersPage(driver);
	
	datepickerspage.clickOnDatePickers();
	datepickerspage.clickOnEnterDateField();
	datepickerspage.selectDate("20-08-2022");
}


}

