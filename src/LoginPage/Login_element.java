package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_element {

    public WebDriver driver;
    // can use private modifier

    public Login_element(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoginTab() {
        return driver.findElement(By.xpath("//div[@id='menu']//li//a[@href='/Account/Login.cshtml']"));
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("//p[@class='form-actions']//input[@value='Login']"));
    }

    public WebElement getWelcome() {
        return driver.findElement(By.xpath("//div[@class='account']//strong"));
    }

    public WebElement getErrorMessage() {
        return driver.findElement(By.xpath("//div[@id='content']//p[@class='message error LoginForm']"));
    }

    public WebElement getUsernameError() {
        return driver.findElement(By.xpath("//li[@class='username']//label[@class='validation-error']"));
    }

    public WebElement getPWError() {
        return driver.findElement(By.xpath("//li[@class='password']//label[@class='validation-error']"));
    }

    public void getHomePage() throws InterruptedException {
        driver.navigate().to("http://www.railwayb2.somee.com");
        Thread.sleep(1000);
    }
    public void Login(String username, String password) throws InterruptedException {
        getLoginTab().click();
        getUsername().sendKeys(username);
        getPassword().sendKeys(password);
        Thread.sleep(1000);
        getLoginButton().click();

    }
}
