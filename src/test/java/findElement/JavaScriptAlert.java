package findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptAlert {
    @Test
    void validatepopupdisplay(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[.='Click for js Alert']")).click();
        driver.switchTo().alert().accept();


        String result = driver.findElement(By.id("result")).getText().trim();
        Assert.assertEquals(result,"You successfully click on alert");

        driver.findElement(By.xpath("//button[.='Click for js Confirm']")).click();
        driver.switchTo().alert().dismiss();
        result = driver.findElement(By.id("result")).getText().trim();
        Assert.assertEquals(result,"You clicked: Ok");

        driver.findElement(By.xpath("//button[.='Click for js Prompt']")).click();
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();
        result = driver.findElement(By.id("result")).getText().trim();
        Assert.assertEquals(result,"Hello");






    }
}
