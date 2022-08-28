package ExecuteTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.HomePage;

public class HomeTest extends BaseClass{
	HomePage homepage;//Aggregation
	@Test
	public void verify_whether_Logo_Displayes()
	{
		homepage=new HomePage(driver);
		boolean status=homepage.isLogoDisplayed();
		Assert.assertTrue(status);
		

	}

}
