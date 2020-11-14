package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class BMIPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions mouse = new Actions(driver);

        driver.get("https://www.calculator.net/bmi-calculator.html");
        driver.findElement(By.id("menuon")).click();

        driver.findElement(By.id("cage")).clear();
        driver.findElement(By.id("cage")).sendKeys("26");

        driver.findElement(By.id("csex1")).click();

        driver.findElement(By.id("cheightmeter")).clear();
        driver.findElement(By.id("cheightmeter")).sendKeys("170");

        driver.findElement(By.id("ckg")).clear();
        driver.findElement(By.id("ckg")).sendKeys("71");

        driver.findElement(By.xpath("//input[@value=\"Calculate\"]")).click();
        String result = driver.findElement(By.className("bigtext")).getText();

        Assert.assertEquals(result, "BMI = 24.6 kg/m2   (Normal)");

        driver.quit();

    }
}