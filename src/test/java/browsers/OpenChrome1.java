package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com.vn");
        driver.manage().window().fullscreen();

        driver.close();
        driver.quit();
    }
}
