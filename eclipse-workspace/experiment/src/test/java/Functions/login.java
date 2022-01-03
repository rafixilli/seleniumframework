package Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Common.BaseClass;
import Pages.Object_Login;

public class login extends BaseClass {
	WebDriverWait Wait;

	// WebDriver driver;
	@Test
	public void login() throws Exception {

		Object_Login object = new Object_Login(driver);
		Wait = new WebDriverWait(driver, 10);
		Thread.sleep(3000);
		object.usernameTextField().sendKeys(prop.getProperty("username"));
		object.passwordTextField().sendKeys(prop.getProperty("password"));
		 object.loginButton().click();
		 
		 String verify=object.verifylogin().getAttribute("id");
		 if(verify.contains(verify)) {
			 System.out.println("success");
		 }
		 else {
			 System.out.println("failed");
		 }

	}

}
