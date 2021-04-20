package steps;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Editlead extends BaseClass
{
	@When("Click on Find Leads")
	public void clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();

	}
	@When("Click on Phone")
	public void click_Phonenumber() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}

	@When("Enter phone number as {string}")
	public void enter_phone_number(String phnum) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phnum);

	}
	@When("Click find Leads button")
	public void click_Search() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

	}
	@When("Select Lead")
	public void select_Lead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}
	@When("Click Edit button")
	public void click_Edit() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@Given("Enter Company Name as {string}")
	public void enter_CompanyName(String cname) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);

	}
	@When("Click Submit")
	public void finalEditSubmit() {
		driver.findElement(By.name("submitButton")).click();

	}
	
}
