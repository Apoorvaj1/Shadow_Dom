package org.shadow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Example {
    EdgeDriver driver;
    @Test
    public void Shadow(){
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://letcode.in/shadow");
        String str = "return document.querySelector(\"#open-shadow\").shadowRoot.querySelector(\"#fname\")";
        WebElement str1 =(WebElement)driver.executeScript(str);
        str1.sendKeys("Apoorv");

    }
}
