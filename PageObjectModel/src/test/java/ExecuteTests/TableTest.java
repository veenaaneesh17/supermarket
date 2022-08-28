package ExecuteTests;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.TablePage;

public class TableTest extends BaseClass{
	TablePage tablepage;
	@Test
	public void VerifyPersonsOffice()
	{
		tablepage=new TablePage(driver);
		tablepage.clicktable();
		String text=tablepage.getPersonsOffice("Garrett Winters");
		System.out.println(text);
	}
	@Test
	public void verifyTextNames()
	{
		tablepage=new TablePage(driver);
		tablepage.clicktable();
		String text=tablepage.getPersonsData("Rhona Davidson",3);
		System.out.println(text);
		
	}
	

}
