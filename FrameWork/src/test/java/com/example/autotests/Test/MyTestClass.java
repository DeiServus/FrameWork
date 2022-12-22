package com.example.autotests.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.autotests.Model.SlaviankaPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.Test;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyTestClass{


    public static void setUpAll() {
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @Test
    public void SearchPaltoTest() throws InterruptedException {
        SlaviankaPage superLamaPage= new SlaviankaPage();
        superLamaPage.openPage();
        superLamaPage.setSearchLineToValues();
    }
    @Test
    public void SortManClothesByDate()
    {
        SlaviankaPage superLamaPage= new SlaviankaPage();
        superLamaPage.openPage();
        superLamaPage.sortBySomething(superLamaPage.datesort);
    }
    @Test
    public void SortManClothesByPrice1()
    {
        SlaviankaPage superLamaPage= new SlaviankaPage();
        superLamaPage.openPage();
        superLamaPage.sortBySomething(superLamaPage.pricesort1);
    }
    @Test
    public void SortManClothesByPrice2()
    {
        SlaviankaPage superLamaPage= new SlaviankaPage();
        superLamaPage.openPage();
        superLamaPage.sortBySomething(superLamaPage.pricesort2);
    }
    @Test
    public void CheckLastNews()
    {
        SlaviankaPage superLamaPage= new SlaviankaPage();
        superLamaPage.openPage();
        superLamaPage.checkLastNews();
    }
    @Test
    public void LoginProfile() {
        SlaviankaPage superLamaPage= new SlaviankaPage();
        superLamaPage.openPage();
        superLamaPage.loginProfile();
        superLamaPage.clickOnElement(superLamaPage.profilebutton);
        sleep(15000);
    }
    @Test
    public void ExitProfile(){
        SlaviankaPage superLamaPage= new SlaviankaPage();
        superLamaPage.openPage();
        superLamaPage.loginProfile();
        superLamaPage.clickOnElement(superLamaPage.profilebutton);
        superLamaPage.clickOnElement(superLamaPage.exitprofilebutton);
        superLamaPage.clickOnElement(superLamaPage.profilebutton);
        sleep(15000);
    }
    @Test
    public void CheckLocation(){
        SlaviankaPage superLamaPage= new SlaviankaPage();
        superLamaPage.openPage();
        superLamaPage.checkLocation();
        sleep(15000);
    }
    @Test
    public void AddToBasket(){
        SlaviankaPage superLamaPage= new SlaviankaPage();
        superLamaPage.openPage();
        superLamaPage.addToBasket();
    }
}
