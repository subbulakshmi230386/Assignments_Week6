package steps;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class MergeLead 
{
	List<String> allhandles = new ArrayList<String>();
	List<String> allhandles2 = new ArrayList<String>();
	String text;

	String leadID;

	@When("Click Merge Lead")
	public void merge_Lead_Click() {
		driver.findElement(By.linkText("Merge Leads")).click();

	}
	@When("Click From Lead")
	public void from_Lead_Click() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();

	}
	@When("Get Window Handle for From Lead")
	public void getHandlewWindow() {
	Set<String> allWindows = driver.getWindowHandles();
	allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(1));

	}
		@When("Enter Lead Name as {string}")
		public void from_lead_name(String fromLeadName) {
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fromLeadName);

		}
		@When("Click find Leads")
		public void find_Lead_Click() throws InterruptedException {
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(1000);
		}
		@Given("Get LeadID")
		public void get_LeadId() {
			leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();

		}
		@When("Click First lead")
		public void first_Lead() {
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		}
		@When("Switch back window handle")
		public void switch_Window() {
			driver.switchTo().window(allhandles.get(0));

		}
		 
			@When("Click To lead")
			public void click_To_LeadButton() {
				driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

			}
			@When("Get Second Window Handle")
			public void get_Second_Window() {
				Set<String> allWindows2 = driver.getWindowHandles();
				allhandles2 = new ArrayList<String>(allWindows2);
				driver.switchTo().window(allhandles2.get(1));

			}
			@When("Send To Lead Id Name as {string}")
			public void send_To_Lead(String toLeadName) {
				driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(toLeadName);

			}
			@When("Select First To Lead Id")
			public void First_To_LeadId() {
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

			}

			@When("Switch back to Parent Window")
			public void switch_Parent_Window() {
				driver.switchTo().window(allhandles2.get(0));

			}
			@When("Click Merge button")
			public void click_Merge() {
				driver.findElement(By.xpath("//a[text()='Merge']")).click();

			}

			@When("Alert Accept")
			public void accept_Alert() {
				driver.switchTo().alert().accept();

			}

			@When("Click Search Leads")
			public void search_Lead() {
				driver.findElement(By.linkText("Find Leads")).click();

			}

			@When("Send Lead Id")
			public void send_Lead_Id() {
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);

			}

			@When("Search for entered Lead Id")
			public void search_Enter_Id() {
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

			}

			@When("Get the Text Displayed")
			public void get_Text_Displayed() {
				text = driver.findElement(By.className("x-paging-info")).getText();

			}

			@Then("Verify text displayed")
			public void verifyTextDisplayed() {
				if (text.equals("No records to display")) {
					System.out.println("Text matched");
				} else {
					System.out.println("Text not matched");
				}

			}
}
