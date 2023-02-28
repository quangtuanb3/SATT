package Initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    //can use protected modifier

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\TESTING\\Setup\\chromedriver_win32_110.0.5481.77\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void tearDown() {
        driver.quit();
    }
}
