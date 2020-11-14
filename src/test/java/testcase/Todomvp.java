package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Todomvp {
    @Test
    void VerifyTask1() {
        WebDriver driver = new ChromeDriver();
        Actions mouse = new Actions(driver);


        driver.get("http://todomvc.com/examples/vanillajs/");
        driver.findElement(By.className("new-todo")).sendKeys("Task1\n");

        //todo click all tab
        driver.findElement(By.xpath("//a[.='All")).click();
        WebElement task = driver.findElement(By.xpath("//label[.='task 1']"));
        Assert.assertTrue(task.isDisplayed());
        //todo click active all
        driver.findElement(By.xpath("//a[.='All")).click();
        task = driver.findElement(By.xpath("//label[.='task 1']"));
        Assert.assertTrue(task.isDisplayed());

        //todo: get item left
        String itemLeft = driver.findElement(By.xpath("//span[@class='todo-count']/strong")).getText();
        Assert.assertEquals(itemLeft,"1");

    }


    }




