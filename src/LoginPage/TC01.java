package LoginPage;

import Initialization.TestBase;

public class TC01 extends TestBase {

    public static void main(String[] args) throws Exception {
        TC01 test = new TC01();
        test.setUp();
        Login_element loginElement = new Login_element(driver);

        loginElement.getHomePage();
        loginElement.Login("demo2@gmail.com","12345678");

        if (driver.getCurrentUrl().equals("http://www.railwayb2.somee.com/Page/HomePage.cshtml")) {
            if (loginElement.getWelcome().getText().equals("Welcome demo2@gmail.com")) {
                System.out.println("Case 1 Passed: User can log into Railway with valid username and password");
            } else {
                System.out.println("Case 1 Fail");
            }
            test.tearDown();
        }
    }
}
