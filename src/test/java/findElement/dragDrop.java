package findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dragDrop {
    @Test
    void dragDrop1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions mouse = new Actions(driver);
        WebElement A = driver.findElement(By.id("column-a"));
        WebElement B = driver.findElement(By.id("column-b"));
        mouse.dragAndDrop(A, B).build().perform();
    }

    @Test
    void rightClick() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions mouse = new Actions(driver);
        WebElement squareBox = driver.findElement(By.id("hot-spot"));
        mouse.contextClick(squareBox).perform();
        driver.switchTo().alert().accept();
    }

    @Test
    void keyPress(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/key_presses");
        Actions keyboard = new Actions(driver);
        keyboard.sendKeys(Keys.ARROW_DOWN).build().perform();
    }

    /**
     * presenceOfElementLocated --> find element in html DOM
     * visibilityOfElementLocated --> find element in html DOM AND visibility [@style!= Display:none]
     * @throws InterruptedException
     */
    @Test
    void loadingTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button[.='Start']")).click();

        WebDriverWait wait = new WebDriverWait(driver,30);
        String finished = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")))
                .findElement(By.tagName("h4")).getText().trim();

        Assert.assertEquals(finished,"Hello World!");
    }


}