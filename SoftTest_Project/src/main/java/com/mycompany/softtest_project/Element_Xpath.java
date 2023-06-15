package com.mycompany.softtest_project;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ASUS
 */
@Getter
@Setter
public class Element_Xpath {
    // Register User
    private final String continueXPath = "/html/body/section[2]/div/div/div/div/form/div[6]/button";
    private final String usernameXPath = "/html/body/section[2]/div/div/div/div/form/div[1]/input";
    private final String emailXPath = "/html/body/section[2]/div/div/div/div/form/div[2]/input";
    private final String passwordXPath = "/html/body/section[2]/div/div/div/div/form/div[3]/input";
    private final String cPasswordXPath = "/html/body/section[2]/div/div/div/div/form/div[4]/input";
    // Billing Detail User
    private final String firstNameXpath = "/html/body/section[2]/div/form/div/div[1]/div[2]/div/div[1]/div/input";
    private final String lastNameXpath = "/html/body/section[2]/div/form/div/div[1]/div[2]/div/div[2]/div/input";
    private final String phoneNumberXpath = "/html/body/section[2]/div/form/div/div[1]/div[2]/div/div[3]/div/input";
    private final String companyNameXpath = "/html/body/section[2]/div/form/div/div[1]/div[2]/div/div[5]/div/input";
    private final String streetAddressXpath = "/html/body/section[2]/div/form/div/div[1]/div[2]/div/div[6]/div/input";
    private final String cityXpath = "/html/body/section[2]/div/form/div/div[1]/div[2]/div/div[7]/div/input";
    private final String stateXpath = "/html/body/section[2]/div/form/div/div[1]/div[2]/div/div[8]/div/input";
    private final String countryXpath = "/html/body/section[2]/div/form/div/div[1]/div[2]/div/div[9]/div/input";
    private final String couponXpath = "/html/body/section[2]/div/form/div/div[2]/div/div[1]/div[2]/div/div/input";
    private final String applyCouponXpath = "/html/body/section[2]/div/form/div/div[2]/div/div[1]/div[2]/div/div/div/span";
    private final String paymentXpath = "/html/body/section[2]/div/form/div/div[2]/div/div[2]/div/div";
    //Homepage
    private final String loginBtnHomeXpath = "/html/body/header/div/div/div[3]/div[1]/div/a";
    private final String loginBtnXpath = "/html/body/section[2]/div/div/div/div/form/div[4]/button";

    // Website Builder

    // Select Theme
    private final String settings = "/html/body/div[1]/div[2]/div/div[1]/div/ul/li[8]/a";
    private final String themes = "/html/body/div[1]/div[2]/div/div[1]/div/ul/li[8]/div/ul/li[1]/a";
    private final String selectTheme = "/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div/div/div[8]/label/figure/img";
    private final String selectThemeButton = "/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[3]/div/div/button";

    // Hero Section
    private final String HomeMenu = "/html/body/div[1]/div[2]/div/div[1]/div/ul/li[9]/a";
    private final String HeroSection = "/html/body/div[1]/div[2]/div/div[1]/div/ul/li[9]/div/ul/li[1]/a";
    private final String selectLanguage = "/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[1]/div/div[2]/select";
    private final String addSlider = "/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[1]/div/div[3]/a";

    // Modify Hero Section
    private final String heroImgUrl = "C:\\Users\\andre\\Desktop\\Ga Penting\\coki-pardede_169.jpeg";
    private final String heroImgUrl2 = "C:\\Users\\andre\\Desktop\\Ga Penting\\WhatsApp Image 2023-06-15 at 22.48.35.jpeg";
    private final String selectHeroLanguage ="/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[1]/select";
    private final String chooseHeroFile = "/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[2]/input";
    private final String heroTitle = "/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[3]/div[1]/div/input";
    private final String heroSubtitle = "/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[3]/div[2]/div/input";
    private final String btHeroName = "/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[4]/div[1]/div/input";
    private final String btHeroUrl = "/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[4]/div[2]/div/input";
    private final String heroSerial = "/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/form/div[5]/div/div/input";
    private final String heroSaveBtn = "/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[3]/div/div/button";

}
