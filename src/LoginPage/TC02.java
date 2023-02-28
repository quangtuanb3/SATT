package LoginPage;

import Initialization.TestBase;

public class TC02 extends TestBase {

    public static void main(String[] args) throws Exception {
        TC02 test = new TC02();
        test.setUp();

        Login_element loginElement = new Login_element(driver);
        loginElement.getHomePage();
        loginElement.Login("","12345678");


        if (driver.getCurrentUrl().equals("http://www.railwayb2.somee.com/Account/Login.cshtml"))
        {
            if((loginElement.getUsernameError().getText().contains("You must specify a username.") & loginElement.getErrorMessage().getText().contains("There was a problem with your login and/or errors exist in your form.")))
            {
                System.out.println("Case 2 Passed: User can't login with blank username");
            }
        } else {
            System.out.println("Case 2 Fail");
        }

        test.tearDown();
    }
}
