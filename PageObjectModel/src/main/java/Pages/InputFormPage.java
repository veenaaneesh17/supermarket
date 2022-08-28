package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputFormPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//li[@class='nav-item']//a[@href='simple-form-demo.php']")
	WebElement inputPage;
	@FindBy(xpath ="//a[@href='jquery-select.php']")
	WebElement jquery;
	@FindBy(xpath ="//span[text()='Alaska']")
	WebElement selectClick;
	@FindBy(xpath ="//input[@class='select2-search__field']")
	WebElement send;
	//@FindBy(xpath="//span[text()='California']")
	//WebElement calClick;
	public InputFormPage(WebDriver driver)//constructor
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	public void clickOnInputForm()
		{
			inputPage.click();
		}
	public void clickOnjquery_select()
		{
			jquery.click();
		}
	public void selectState(String state)
		{
		
		selectClick.click();
		send.sendKeys("california");
		driver.findElement(By.xpath("//li[text()='"+state+"']")).click();
		
		}
}
