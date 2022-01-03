package Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Common.BaseClass;
import Pages.Object_Leave;
import Pages.Object_Login;

public class leave extends BaseClass {
	WebDriverWait Wait;
	
	@Test
	public void leave() {
		Object_Leave object = new Object_Leave(driver);
		object.leaveLink().click();
		//object.fromDate().click();
		//object.toDate().click();
		object.fromDate().sendKeys(prop.getProperty("fromdate"));
		object.toDate().sendKeys(prop.getProperty("todate"));


		object.Rejected_checkbox().click();
		object.Employee_TextField().sendKeys("xilli");
		
		Select subDropdown = new Select(object.SubUnit_dropdown());
		subDropdown.selectByIndex(1);
		object.pastEmp_checkbox().click();
		object.Search_Button().click();
		object.Reset_Button().click();
		}
		
			
	}


