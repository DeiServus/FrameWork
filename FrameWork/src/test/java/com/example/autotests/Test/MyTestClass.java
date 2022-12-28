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
    public void SearchCoatTest() throws InterruptedException {
        SlaviankaPage sPage= new SlaviankaPage();
        sPage.openPage();
        sPage.setSearchLineToValues();
        assertEquals("Результаты поиска \"пальто\". Найдено 108", sPage.header.getText(), "sho");
    }
    @Test
    public void SortManClothesByDate()
    {
        SlaviankaPage sPage= new SlaviankaPage();
        sPage.openPage();
        sPage.sortBySomething(sPage.datesort);
        assertEquals("ДЛЯ МУЖЧИН", sPage.header.getText());
    }
    @Test
    public void SortManClothesByPrice1()
    {
        SlaviankaPage sPage= new SlaviankaPage();
        sPage.openPage();
        sPage.sortBySomething(sPage.pricesort1);
        assertEquals("ДЛЯ МУЖЧИН", sPage.header.getText());
    }
    @Test
    public void SortManClothesByPrice2()
    {
        SlaviankaPage sPage= new SlaviankaPage();
        sPage.openPage();
        sPage.sortBySomething(sPage.pricesort2);
        assertEquals("ДЛЯ МУЖЧИН", sPage.header.getText());
    }
    @Test
    public void CheckLastNews()
    {
        SlaviankaPage sPage= new SlaviankaPage();
        sPage.openPage();
        sPage.checkLastNews();
        assertEquals("ПРЕЗЕНТАЦИЯ КОЛЛЕКЦИИ ОДЕЖДЫ ПРОЕКТА НА КУЛЬТУРНО-СПОРТИВНОМ ФЕСТИВАЛЕ «ВЫТОКI. КРОК ДА АЛIМПУ»", sPage.header.getText());
    }
    @Test
    public void LoginProfile() {
        SlaviankaPage sPage= new SlaviankaPage();
        sPage.openPage();
        sPage.loginProfile();
        sPage.clickOnElement(sPage.profilebutton);
        sleep(5000);
    }
    @Test
    public void ExitProfile(){
        SlaviankaPage sPage= new SlaviankaPage();
        sPage.openPage();
        sPage.loginProfile();
        sPage.clickOnElement(sPage.profilebutton);
        sPage.clickOnElement(sPage.exitprofilebutton);
        sPage.clickOnElement(sPage.profilebutton);
        sleep(5000);
    }
    @Test
    public void CheckLocation(){
        SlaviankaPage sPage= new SlaviankaPage();
        sPage.openPage();
        sPage.checkLocation();
        assertEquals("МАГАЗИНЫ", sPage.header.getText());
        sleep(5000);
    }
    @Test
    public void AddToBasket(){
        SlaviankaPage sPage= new SlaviankaPage();
        sPage.openPage();
        sPage.addToBasket();
        assertEquals("ПАЛЬТО МУЖСКОЕ", sPage.header.getText());
    }
}
