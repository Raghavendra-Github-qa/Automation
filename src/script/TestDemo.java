package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.HomePage;
import page.LoginPage;

public class TestDemo extends BaseTest{
	@Test
	public void testA() {
		String data = Utility.getXLData(INPUT_PATH, "sheet1", 0, 0);
		Reporter.log("Data : "+data,true);
		
		int r = Utility.getXLRowCount(INPUT_PATH, "sheet1");
		Reporter.log("Row : "+r,true);
//		Assert.fail();
		
//		String p = Utility.getPhoto(driver, PHOTO_PATH);
//		Reporter.log("Photo : "+p,true);
		LoginPage l=new LoginPage(driver);
		l.setUserName(Utility.getXLData(INPUT_PATH, "sheet1", 1, 0));
		l.setPassword(Utility.getXLData(INPUT_PATH, "sheet1", 1, 1));
		l.clickLogin();
		HomePage h = new HomePage(driver);
		h.clickLogout();
	}
}