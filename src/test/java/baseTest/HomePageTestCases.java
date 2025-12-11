package baseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePageValidation;

public class HomePageTestCases extends BaseTestClass {

	
	
	@Test
	public void TC01_UrlValidation() {
		String Acturl=driver.getCurrentUrl();
		System.out.println(Acturl);
		if (Acturl.toLowerCase().contains("registration")) {
			Assert.assertEquals(true, true);
			
		}else {
			System.out.println("URL is not matched ");
		}	
	}
	
	@Test
	public void TC02_FillFormTextBox() {
		HomePageValidation hp = new HomePageValidation(driver);
		hp.RadioBtn();
		hp.FormTextBox("aman", "khan", "88amankhan@gmail.com", "Aman@1234", "414-A, Bhopal", "462023");
		hp.DropDown();
		hp.FileUpload();
		hp.relocatebtn();
		String msg=hp.waitForAlert();
		
				
		if(msg.toLowerCase().contains("successfully")){
			Assert.assertEquals(true, true);
			System.out.println("pass");
		}else {
			System.out.println("Form not submit successfully");
		}
		
		
		
		
		
	}
	
	
	
	
	
}
