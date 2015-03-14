package com.rest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by amarjeet.singh on 14/12/14.
 */
public class XPath {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\TAMANNA\\\\Downloads\\\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/Users/amarjeet.singh/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.in/");
        (new WebDriverWait(driver,30)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver1) {
                return driver1.getTitle().startsWith("Online");
            }

        });

        Boolean t=driver.findElement(By.className("nav-logo-link")).isDisplayed();
        System.out.println(t);
        driver.manage().window().maximize();

        Boolean h=driver.findElement(By.xpath("//div[@id='nav_cats']")).isDisplayed();
        System.out.println(h);
        for(int i=0;i<16;i++)
        {

            //  driver.findElement(By.xpath("//div[@id=nav_cats]/u1/li["+i+"]")).isDisplayed();
            //  System.out.println(driver.findElement(By.xpath("//div[@id=nav_cats]/u1/li[" + i + "]")).getClass());
        }

    }
}
