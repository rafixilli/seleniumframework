package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Leave {
	  WebDriver driver;
		
		public Object_Leave(WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		@FindBy(xpath="//b[text()='Leave']")
		WebElement leaveLink;
		@FindBy(xpath="//input[@id='calFromDate']")
		WebElement fromDate;
		@FindBy(xpath="//input[@id='calToDate']")
		WebElement toDate;
		@FindBy(xpath="//label[text()='Rejected']")
		WebElement Rejected_checkbox;
		@FindBy(xpath="//input[@class='ac_input inputFormatHint']")
		WebElement Employee_TextField;
		@FindBy(xpath="//select[@id='leaveList_cmbSubunit']")
		WebElement SubUnit_dropdown;
		@FindBy(xpath="//input[@id='leaveList_cmbWithTerminated']")
		WebElement pastEmp_checkbox;
		@FindBy(xpath="//input[@id='btnSearch']")
		WebElement Search_Button;
		@FindBy(xpath="//input[@id='btnReset']")
		WebElement Reset_Button;
		
		public WebElement leaveLink() {
			return leaveLink;
		}
		public WebElement fromDate() {
			return fromDate;
}
		public WebElement toDate() {
			return toDate;
}
		public WebElement Rejected_checkbox() {
			return Rejected_checkbox;
}
		public WebElement Employee_TextField() {
			return Employee_TextField;
		
}
		public WebElement SubUnit_dropdown() {
			return SubUnit_dropdown;
}
		public WebElement pastEmp_checkbox() {
			return pastEmp_checkbox;
}
		public WebElement Search_Button() {
			return Search_Button;
}
		public WebElement Reset_Button() {
			return Reset_Button;
}
}