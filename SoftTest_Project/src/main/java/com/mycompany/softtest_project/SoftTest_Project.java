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
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", 
        "C:\\Users\\ASUS\\Documents\\KuliahS6\\Software Testing\\chromedriver\\chromedriver.exe");
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
        registerUser();
        billingDetailUser();
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
        String continueXPath = "/html/body/section[2]/div/div/div/div/form/div[6]/button";
        String usernameXPath = "/html/body/section[2]/div/div/div/div/form/div[1]/input";
        String emailXPath = "/html/body/section[2]/div/div/div/div/form/div[2]/input";
        String passwordXPath = "/html/body/section[2]/div/div/div/div/form/div[3]/input";
        String cPasswordXPath = "/html/body/section[2]/div/div/div/div/form/div[4]/input";  
        WebElement editText = driver.findElement(By.xpath(usernameXPath));
        editText.sendKeys(user.getUsername());
        editText = driver.findElement(By.xpath(emailXPath));
        editText.sendKeys(user.getEmail());
        editText = driver.findElement(By.xpath(passwordXPath));
        editText.sendKeys(user.getPassword());
        editText = driver.findElement(By.xpath(cPasswordXPath));
        editText.sendKeys(user.getPassword());
        editText = driver.findElement(By.xpath(continueXPath));
        editText.click();
    }
    private static void billingDetailUser(){
        String firstNameXpath = "/html/body/section[2]/div/form/div/div[1]/div[2]/div/div[1]/div/input";
        String lastNameXpath = "/html/body/section[2]/div/form/div/div[1]/div[2]/div/div[2]/div/input";
        String phoneNumberXpath = "/html/body/section[2]/div/form/div/div[1]/div[2]/div/div[3]/div/input";
        String companyNameXpath = "/html/body/section[2]/div/form/div/div[1]/div[2]/div/div[5]/div/input";
        String streetAddressXpath = "/html/body/section[2]/div/form/div/div[1]/div[2]/div/div[6]/div/input";
        String cityXpath = "/html/body/section[2]/div/form/div/div[1]/div[2]/div/div[7]/div/input";
        String stateXpath = "/html/body/section[2]/div/form/div/div[1]/div[2]/div/div[8]/div/input";
        String countryXpath = "/html/body/section[2]/div/form/div/div[1]/div[2]/div/div[9]/div/input";
        String couponXpath = "/html/body/section[2]/div/form/div/div[2]/div/div[1]/div[2]/div/div/input";
        String applyCouponXpath = "/html/body/section[2]/div/form/div/div[2]/div/div[1]/div[2]/div/div/div/span";
        String paymentXpath = "/html/body/section[2]/div/form/div/div[2]/div/div[2]/div/div";
        
        String coupon = "softwaretesting";
        WebElement editText = driver.findElement(By.xpath(firstNameXpath));
        editText.sendKeys(user.getFirstName());
        editText = driver.findElement(By.xpath(lastNameXpath));
        editText.sendKeys(user.getLastName());
        editText = driver.findElement(By.xpath(phoneNumberXpath));
        editText.sendKeys(user.getPhoneNumber());
        editText = driver.findElement(By.xpath(companyNameXpath));
        editText.sendKeys(user.getCompanyName());
        editText = driver.findElement(By.xpath(streetAddressXpath));
        editText.sendKeys(user.getCountry()+" - Surabaya");
        editText = driver.findElement(By.xpath(cityXpath));
        editText.sendKeys("surabaya");
        editText = driver.findElement(By.xpath(stateXpath));
        editText.sendKeys("Jawa Timur");
        editText = driver.findElement(By.xpath(countryXpath));
        editText.sendKeys(user.getCountry());
        editText = driver.findElement(By.xpath(couponXpath));
        editText.sendKeys(coupon);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            
        }
        editText = driver.findElement(By.xpath(applyCouponXpath));
        editText.click();
        
        WebDriverWait dWait = new WebDriverWait(driver, 10);
        dWait.until(ExpectedConditions.presenceOfElementLocated(By.className("alert-success")));
        editText = driver.findElement(By.xpath("/html/body/section[2]/div/form/div/div[2]/div/div[6]/button"));
        editText.click();
        dWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div/div/div[2]/a")));
        editText = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/a"));
        editText.click();
    }
}
