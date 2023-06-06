/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.softtest_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author ASUS
 */
public class SoftTest_Project {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", 
        "C:\\Users\\ASUS\\Documents\\KuliahS6\\Software Testing\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://gruplm.com/");
        driver.manage().window().maximize();
        String allowCookies = "/html/body/div[2]/div/div/div/button";
        String lifetimePackage = "/html/body/section[7]/div/div[2]/div/div/ul/li[3]/a";
        String purchaseLifetimePackage = "/html/body/section[7]/div/div[3]/div[3]/div/div[3]/div/div[3]/a";
        WebElement cookiesClick = driver.findElement(By.xpath(allowCookies));
        cookiesClick.click();
        WebElement elementToClick = driver.findElement(By.xpath(lifetimePackage));
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToClick).perform();
        elementToClick.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            
        }
        WebElement elementToScrollTo = driver.findElement(By.xpath(purchaseLifetimePackage));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(elementToScrollTo));
        actions.moveToElement(elementToScrollTo).perform();
        elementToScrollTo.click();
        
        String continueXPath = "/html/body/section[2]/div/div/div/div/form/div[6]/button";
        String usernameXPath = "/html/body/section[2]/div/div/div/div/form/div[1]/input";
        String emailXPath = "/html/body/section[2]/div/div/div/div/form/div[2]/input";
        String passwordXPath = "/html/body/section[2]/div/div/div/div/form/div[3]/input";
        String cPasswordXPath = "/html/body/section[2]/div/div/div/div/form/div[4]/input";
    }
}
