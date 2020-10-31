package findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFrameTest {
    @Test
    void validateLeftFrame() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");
        //is frame top
        driver.switchTo().frame("frame-left");
        String body  = driver.findElement(By.xpath("html/body")).getText().trim();
        System.out.println(body);
        Assert.assertEquals(body,"LEFT");

        driver.switchTo().parentFrame(); //->frame top
        driver.switchTo().frame("frame-middle");
        String middleFrameBody = driver.findElement(By.id("content")).getText().trim();
        Assert.assertEquals(middleFrameBody,"MIDDLE");

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        String rightFrameBody = driver.findElement(By.xpath("html/body")).getText().trim() ;
        Assert.assertEquals(rightFrameBody,"RIGHT");

        driver.switchTo().parentFrame() ;
        driver.switchTo().frame("frame-bottom");
        String bottomFrameBody = driver.findElement(By.id("html/body")).getText().trim();
        Assert.assertEquals(bottomFrameBody,"BOTTOM");
        driver.quit();
    }
}
