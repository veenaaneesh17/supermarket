package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.Utility;

public class TablePage {
	public WebDriver driver;
	 Utility utility;
	 
	 @FindBy (xpath = "(//a[@class='nav-link'])[4]")
	 WebElement Tablee;
	
	
	public TablePage(WebDriver driver)//constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clicktable()
	{
		Tablee.click();
	}
	public String getPersonsOffice(String personsName)
	{
		int i;
		utility=new Utility(driver);
		List<String>name=new ArrayList<String>();
		name=utility.getTextOfElements("//table//tbody//tr//td[1]");
		for(i=0;i<name.size();i++)
			{
				if(personsName.equals(name.get(i)))
					{
						break;
					}
			}
		
		return driver.findElement(By.xpath("//tr["+(i+1)+"]//td[3]")).getText();
		//System.out.println(name);
		
	}
	public String getPersonsData(String personsName,int n)
	{
		
		int i;
		utility=new Utility(driver);
		List<String>name=new ArrayList<String>();
		name=utility.getTextOfElements("//table//tbody//tr//td[1]");
		//System.out.println(name);
		for(i=0;i<name.size();i++) 
		{
			if( personsName.equals(name.get(i)))
			{
				break;
			}
		
			//System.out.println(name.get(i));
		}
		return driver.findElement(By.xpath("//tr["+(i+1)+"]//td["+n+"]")).getText();
	}
}
	
