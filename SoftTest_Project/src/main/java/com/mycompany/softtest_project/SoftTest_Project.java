/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.softtest_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Driver;
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
    private static User user;
    private static WebDriver driver;
    private static Element_Xpath eXpath = new Element_Xpath();

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", 
        "C:\\Users\\andre\\Desktop\\Kuliah\\SEM 6\\SOFT TEST\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gruplm.com/");
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

        user = ReadCSV();
//        registerUser();
//        billingDetailUser();
        loginUser();
    }
    private static User ReadCSV() {
        String[] values={};
        try {
            URL url = new URL("https://docs.google.com/spreadsheets/d/e/2PACX-1vTpvnPSxUwo04-RVz8HGQZuw_v0pzYqDFzBSF6rhP_nAuLmGm4Aq3nJGUs9E1C4W5IXfgTdB6YVzcym/pub?output=csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            boolean title=true;
            String line; 
            line = reader.readLine();
            System.out.println(line);
            values= line.split(",");
            reader.close();
            return new User(values[0],values[1],values[2],values[3],values[4],values[5],values[6],values[7]);
                

        } catch (IOException e) {
            e.printStackTrace();
            return new User(values[0],values[1],values[2],values[3],values[4],values[5],values[6],values[7]);
        }
    }
    private static void registerUser(){
        WebElement editText = driver.findElement(By.xpath(eXpath.getUsernameXPath()));
        editText.sendKeys(user.getUsername());
        editText = driver.findElement(By.xpath(eXpath.getEmailXPath()));
        editText.sendKeys(user.getEmail());
        editText = driver.findElement(By.xpath(eXpath.getPasswordXPath()));
        editText.sendKeys(user.getPassword());
        editText = driver.findElement(By.xpath(eXpath.getCPasswordXPath()));
        editText.sendKeys(user.getPassword());
        editText = driver.findElement(By.xpath(eXpath.getContinueXPath()));
        editText.click();
    }
    private static void billingDetailUser(){
        String coupon = "softwaretesting";
        WebElement editText = driver.findElement(By.xpath(eXpath.getFirstNameXpath()));
        editText.sendKeys(user.getFirstName());
        editText = driver.findElement(By.xpath(eXpath.getLastNameXpath()));
        editText.sendKeys(user.getLastName());
        editText = driver.findElement(By.xpath(eXpath.getPhoneNumberXpath()));
        editText.sendKeys(user.getPhoneNumber());
        editText = driver.findElement(By.xpath(eXpath.getCompanyNameXpath()));
        editText.sendKeys(user.getCompanyName());
        editText = driver.findElement(By.xpath(eXpath.getStreetAddressXpath()));
        editText.sendKeys(user.getCountry()+" - Surabaya");
        editText = driver.findElement(By.xpath(eXpath.getCityXpath()));
        editText.sendKeys("surabaya");
        editText = driver.findElement(By.xpath(eXpath.getStateXpath()));
        editText.sendKeys("Jawa Timur");
        editText = driver.findElement(By.xpath(eXpath.getCountryXpath()));
        editText.sendKeys(user.getCountry());
        editText = driver.findElement(By.xpath(eXpath.getCouponXpath()));
        editText.sendKeys(coupon);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        editText = driver.findElement(By.xpath(eXpath.getApplyCouponXpath()));
        editText.click();
        
        WebDriverWait dWait = new WebDriverWait(driver, 10);
        dWait.until(ExpectedConditions.presenceOfElementLocated(By.className("alert-success")));
        editText = driver.findElement(By.xpath("/html/body/section[2]/div/form/div/div[2]/div/div[6]/button"));
        editText.click();
        dWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div/div/div[2]/a")));
        editText = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/a"));
        editText.click();
    }
    private static void loginUser(){
        WebDriverWait dWait = new WebDriverWait(driver, 10);
        dWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(eXpath.getLoginBtnHomeXpath())));
        WebElement editText = driver.findElement(By.xpath(eXpath.getLoginBtnHomeXpath()));
        editText.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        editText = driver.findElement(By.xpath(eXpath.getUsernameXPath()));
        editText.sendKeys(user.getEmail());
        editText = driver.findElement(By.xpath(eXpath.getEmailXPath()));
        editText.sendKeys(user.getPassword());
        editText = driver.findElement(By.xpath(eXpath.getLoginBtnXpath()));
        editText.click();
    }
}
