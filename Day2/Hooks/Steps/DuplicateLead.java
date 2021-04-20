package steps;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
public class DuplicateLead extends BaseClass 
{
	@Given("Find Lead clicked")
	public void find_lead_clicked()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Given("Phone clicked")
	public void phone_clicked()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Given("phonenumber {string}")
	public void ph_num(String ph)
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(ph);
	}
	@When("Find Lead1 clicked")
	public void find_lead_click()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@When ("LeadList and duplicate clicked")
	public void lead_list_duplicate_click()
	{
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	@When("submitButton clicked")
	public void submit_button()
	{
		driver.findElement(By.name("submitButton")).click();
	}
	}
