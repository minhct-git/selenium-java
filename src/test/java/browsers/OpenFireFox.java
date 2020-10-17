package browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        new FirefoxDriver();
    }
}
