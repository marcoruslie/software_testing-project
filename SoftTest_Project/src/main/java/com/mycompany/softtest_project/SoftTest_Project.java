/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.softtest_project;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
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
        // Web Templating
        WebElement settings = driver.findElement(By.xpath(eXpath.getSettings()));
        settings.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
//        WebElement themes = driver.findElement(By.xpath(eXpath.getThemes()));
//        themes.click();
//        WebElement selectTheme = driver.findElement(By.xpath(eXpath.getSelectTheme()));
//        selectTheme.click();
//        WebElement saveTheme = driver.findElement(By.xpath(eXpath.getSelectThemeButton()));
//        saveTheme.click();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//
//        }
        WebElement HomeSection = driver.findElement(By.xpath(eXpath.getHomeMenu()));
        HomeSection.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        // Hero Section
//        WebElement HomeSectionHero = driver.findElement(By.xpath(eXpath.getHeroSection()));
//        HomeSectionHero.click();
//        WebElement HomeSectionHeroLanguage = driver.findElement(By.xpath(eXpath.getSelectLanguage()));
//        HomeSectionHeroLanguage.click();
//        HomeSectionHeroLanguage.sendKeys("English");
//        WebElement AddSliderBtn = driver.findElement(By.xpath(eXpath.getAddSlider()));
//        AddSliderBtn.click();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//
//        }
//        WebElement heroLanguage = driver.findElement(By.xpath(eXpath.getSelectHeroLanguage()));
//        heroLanguage.click();
//        heroLanguage.sendKeys("English");
//        WebElement heroImageFile = driver.findElement(By.xpath(eXpath.getChooseHeroFile()));
//        heroImageFile.sendKeys(eXpath.getHeroImgUrl());
//        WebElement heroTitle = driver.findElement(By.xpath(eXpath.getHeroTitle()));
//        heroTitle.sendKeys("Test");
//        WebElement heroSubtitle = driver.findElement(By.xpath(eXpath.getHeroSubtitle()));
//        heroSubtitle.sendKeys("Test");
//        WebElement heroButton = driver.findElement(By.xpath(eXpath.getBtHeroName()));
//        heroButton.sendKeys("Test");
//        WebElement heroButtonLink = driver.findElement(By.xpath(eXpath.getBtHeroUrl()));
//        heroButtonLink.sendKeys("https://www.google.com/");
//        WebElement heroSerialNumber = driver.findElement(By.xpath(eXpath.getHeroSerial()));
//        heroSerialNumber.sendKeys("1");
//        WebElement heroSave = driver.findElement(By.xpath(eXpath.getHeroSaveBtn()));
//        heroSave.click();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//
//        }
//        WebElement heroLanguage2 = driver.findElement(By.xpath(eXpath.getSelectHeroLanguage()));
//        heroLanguage2.click();
//        heroLanguage2.sendKeys("English");
//        WebElement heroImageFile2 = driver.findElement(By.xpath(eXpath.getChooseHeroFile()));
//        heroImageFile2.sendKeys(eXpath.getHeroImgUrl2());
//        WebElement heroTitle2 = driver.findElement(By.xpath(eXpath.getHeroTitle()));
//        heroTitle2.sendKeys("Test");
//        WebElement heroSubtitle2 = driver.findElement(By.xpath(eXpath.getHeroSubtitle()));
//        heroSubtitle2.sendKeys("Test");
//        WebElement heroButton2 = driver.findElement(By.xpath(eXpath.getBtHeroName()));
//        heroButton2.sendKeys("Test");
//        WebElement heroButtonLink2 = driver.findElement(By.xpath(eXpath.getBtHeroUrl()));
//        heroButtonLink2.sendKeys("https://www.google.com/");
//        WebElement heroSerialNumber2 = driver.findElement(By.xpath(eXpath.getHeroSerial()));
//        heroSerialNumber2.sendKeys("2");
//        WebElement heroSave2 = driver.findElement(By.xpath(eXpath.getHeroSaveBtn()));
//        heroSave2.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
//        // Home Section
//        WebElement HomeSectionHome = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/ul/li[9]/div/ul/li[2]/a"));
//        HomeSectionHome.click();
//        WebElement FeatureItemTitle = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[1]/div[1]/div[2]/div/div/input[2]"));
//        FeatureItemTitle.sendKeys("Feature Item Title");
//        WebElement NewItemTitle = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[1]/div[2]/div[2]/div/div/input[2]"));
//        NewItemTitle.sendKeys("New Item Title");
//        WebElement BestSellerTitle = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[1]/div[3]/div[2]/div/div/input[2]"));
//        BestSellerTitle.sendKeys("Best Seller Title");
//        WebElement TopRatedTitle = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[1]/div[4]/div[2]/div/div/input[2]"));
//        TopRatedTitle.sendKeys("Top Rated Title");
//        WebElement SpecialItemTitle = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[1]/div[5]/div[2]/div/div/input[2]"));
//        SpecialItemTitle.sendKeys("Special Item Title");
//        WebElement FlashSaleItemTitle = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[1]/div[6]/div[2]/div/div/input[2]"));
//        FlashSaleItemTitle.sendKeys("Flash Sale Item Title");
//        WebElement NewsletterTitle = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[2]/div/div[2]/div[1]/div/input[2]"));
//        NewsletterTitle.sendKeys("Newsletter Title");
//        WebElement NewsletterSubtitle = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[2]/div/div[2]/div[2]/div/input[2]"));
//        NewsletterSubtitle.sendKeys("Newsletter Subtitle");
//        WebElement HomeSectionHomeBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[3]/div/div/div/button"));
//        HomeSectionHomeBtn.click();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//
//        }
        // Features
//        WebElement Features = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/ul/li[9]/div/ul/li[3]/a"));
//        Features.click();
//        WebElement addFeatureBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[1]/div/div[3]/a"));
//        addFeatureBtn.click();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//        }
//        WebElement featureLanguage = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[1]/select"));
//        featureLanguage.click();
//        featureLanguage.sendKeys("English");
//        WebElement featureIcon = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[2]/input"));
//        featureIcon.sendKeys("C:\\Users\\andre\\Desktop\\Ga Penting\\Untitled.png");
//        WebElement featureTitle = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[3]/input"));
//        featureTitle.sendKeys("Feature Title");
//        WebElement featureText = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[4]/textarea"));
//        featureText.sendKeys("Feature Text");
//        WebElement featureSerial = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[5]/input"));
//        featureSerial.sendKeys("1");
//        WebElement featureSaveBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[3]/button[2]"));
//        featureSaveBtn.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        // Offer Banner
//        WebElement OfferBanner = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/ul/li[9]/div/ul/li[4]/a"));
//        OfferBanner.click();
//        WebElement addOfferBannerBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[1]/div/div[3]/a"));
//        addOfferBannerBtn.click();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//        }
//        WebElement offerBannerLanguage = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[1]/select"));
//        offerBannerLanguage.click();
//        offerBannerLanguage.sendKeys("English");
//        WebElement offerBannerImage = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[2]/input"));
//        offerBannerImage.sendKeys("C:\\Users\\andre\\Desktop\\Ga Penting\\Screenshot 2021-12-21 200207.png");
//        WebElement offerBannerText1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[3]/input"));
//        offerBannerText1.sendKeys("Offer Banner Text 1");
//        WebElement offerBannerText2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[4]/input"));
//        offerBannerText2.sendKeys("Offer Banner Text 2");
//        WebElement offerBannerText3 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[5]/input"));
//        offerBannerText3.sendKeys("Offer Banner Text 3");
//        WebElement offerBannerUrl = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[6]/input"));
//        offerBannerUrl.sendKeys("https://www.google.com/");
//        WebElement offerBannerPosition = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[7]/select"));
//        offerBannerPosition.click();
//        offerBannerPosition.sendKeys("Top");
//        WebElement offerBannerSaveBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[3]/button[2]"));
//        offerBannerSaveBtn.click();

        // Footer
//        WebElement Footer = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/ul/li[10]/a"));
//        Footer.click();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//        }
//        WebElement FooterSectionClick = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/ul/li[10]/div/ul/li[1]/a"));
//        FooterSectionClick.click();
//        WebElement addFooterLogo = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[1]/input"));
//        addFooterLogo.sendKeys("C:\\Users\\andre\\Desktop\\Ga Penting\\Orang-tua-new.jpg");
//        WebElement footerAboutCompany = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[2]/textarea"));
//        footerAboutCompany.sendKeys("At InnovateTech Solutions, our mission is to empower businesses with technology-driven solutions that drive growth, efficiency, and success. We are committed to providing top-notch software solutions tailored to meet the unique needs of each client, enabling them to achieve their goals and outperform their competition.");
//        WebElement copyrightFooter = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[3]/div/div[3]/div[2]/p"));
//        copyrightFooter.sendKeys("Copyright");
//        WebElement footerSaveBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[3]/div/div/button"));
//        footerSaveBtn.click();

        // ShopManagement
        WebElement ShopManagement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/ul/li[5]/a"));
        ShopManagement.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        WebElement ManageItemsClick = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/ul/li[5]/div/ul/li[4]/a"));
        ManageItemsClick.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        WebElement categorySection = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/ul/li[5]/div/ul/li[4]/div/ul/li[1]/a"));
        categorySection.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
//        for (int i = 1; i < 6; i++) {
//            addCat(i);
//        }
        WebElement subCategorySection = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/ul/li[5]/div/ul/li[4]/div/ul/li[2]/a"));
        subCategorySection.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
//        WebElement addSubCategoryBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[1]/div/div[3]/a"));
//        addSubCategoryBtn.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
//        for (int i = 1; i < 6; i++) {
//            addSubCat(i);
//        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        WebElement addItem = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/ul/li[5]/div/ul/li[4]/div/ul/li[3]/a"));
        addItem.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        WebElement addItemBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div[1]/a/div/div"));
        addItemBtn.click();
        for (int i = 1; i < 6; i++) {
            addItem(i);
        }
    }
    static void addItem(int index){
        WebElement targetDropArea = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/div[2]/form"));
        String filePath = "C:\\Users\\andre\\Desktop\\Ga Penting\\130fe332c7dd9b35019c6fcea6426ed0.jpg";
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(filePath), null);
        for (int i = 0; i < 1; i++) {
            try {
                Robot robot = new Robot();
                robot.setAutoDelay(2000);
                robot.mouseMove(targetDropArea.getLocation().getX()+200, targetDropArea.getLocation().getY()+150);
                robot.setAutoDelay(1000);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
                robot.keyPress(java.awt.event.KeyEvent.VK_V);
                robot.keyRelease(java.awt.event.KeyEvent.VK_V);
                robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
                robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
                robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
            }catch (AWTException e){
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        WebElement itemThumbnail = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[1]/input"));
        itemThumbnail.sendKeys("C:\\Users\\andre\\Desktop\\Ga Penting\\Untitled.png");
        WebElement itemSlider = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[2]/input"));
        itemSlider.sendKeys("C:\\Users\\andre\\Desktop\\Ga Penting\\Untitled.png");
        WebElement itemType = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[4]/select"));
        itemType.click();
        itemType.sendKeys("File Download Link");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        try{
            Robot robot = new Robot();
            robot.mouseWheel(5);
        }catch (AWTException e){
            e.printStackTrace();
        }
        WebElement itemDownloadLink = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[5]/div/div[2]/input"));
        itemDownloadLink.sendKeys("https://www.google.com/");
        WebElement itemStatus = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[6]/div[1]/div/select"));
        itemStatus.click();
        itemStatus.sendKeys("Show");
        WebElement itemCurrPrice = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[6]/div[2]/div/input"));
        itemCurrPrice.sendKeys("100");
        WebElement itemPrevPrice = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[6]/div[3]/div/input"));
        itemPrevPrice.sendKeys("200");
        WebElement catSelect = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[7]/div/div[2]/div/div[1]/div[1]/div/select"));
        catSelect.click();
        catSelect.sendKeys("Category " + index);
        WebElement subcatSelect = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[7]/div/div[2]/div/div[1]/div[2]/div/select"));
        subcatSelect.click();
        subcatSelect.sendKeys("Sub Category " + index);
        WebElement itemTitle = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[7]/div/div[2]/div/div[1]/div[3]/div/input"));
        itemTitle.sendKeys("Item Title " + index);
        try{
            Robot robot = new Robot();
            robot.mouseWheel(5);
        }catch (AWTException e){
            e.printStackTrace();
        }
        WebElement itemSummary = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[7]/div/div[2]/div/div[2]/div[2]/div/textarea"));
        itemSummary.sendKeys("Item Summary " + index);
        try{
            Robot robot = new Robot();
            robot.mouseWheel(5);
        }catch (AWTException e){
            e.printStackTrace();
        }
        WebElement itemDesc = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[7]/div/div[2]/div/div[3]/div/div/div/div[3]/div[2]"));
        itemDesc.click();
        itemDesc.sendKeys("Item Description " + index);
        WebElement itemMetaKeyword = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[7]/div/div[2]/div/div[5]/div/div/textarea"));
        itemMetaKeyword.click();
        itemMetaKeyword.sendKeys("Item Meta Description " + index);
        WebElement submitItemBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[3]/div/div/div/button"));
        submitItemBtn.click();
    }
    static void addSubCat(int index){
        WebElement subCategoryLanguage = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[1]/select"));
        subCategoryLanguage.click();
        subCategoryLanguage.sendKeys("English");
        WebElement subCategoryCat = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[2]/select"));
        subCategoryCat.click();
        subCategoryCat.sendKeys("Category "+index);
        WebElement subCategoryName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[3]/input"));
        subCategoryName.sendKeys("Sub Category "+index);
        WebElement subCategoryStatus = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[4]/select"));
        subCategoryStatus.click();
        subCategoryStatus.sendKeys("Active");
        WebElement subCategorySaveBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[3]/button[2]"));
        subCategorySaveBtn.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
    }
    static void addCat(int index){
        WebElement addCategoryBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[1]/div/div[3]/a"));
        addCategoryBtn.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        WebElement categoryLanguage = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[1]/select"));
        categoryLanguage.click();
        categoryLanguage.sendKeys("English");
        WebElement categoryImage = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[2]/input"));
        categoryImage.sendKeys("C:\\Users\\andre\\Desktop\\Ga Penting\\507284.jpg");
        WebElement categoryName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[3]/input"));
        categoryName.sendKeys("Category " + index);
        WebElement catStatus = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[4]/select"));
        catStatus.click();
        catStatus.sendKeys("Active");
        WebElement catSaveBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[3]/button[2]"));
        catSaveBtn.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
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
