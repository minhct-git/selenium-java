package findElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAuthenticationTest {
    @Test
    void loginAuthentication(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin:admin@");
    }
}
