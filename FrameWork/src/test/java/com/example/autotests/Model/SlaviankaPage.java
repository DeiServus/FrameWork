package com.example.autotests.Model;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class SlaviankaPage {

    public final String URL = "https://slavianka.by/";
    public final SelenideElement header = $x("//h1");
    public final SelenideElement searchbutton = $x("/html/body/div[1]/div[1]/div/div[6]/div[2]");
    public final SelenideElement searchline = $x("/html/body/div[7]/div[3]/div[2]/form/div[1]/input");
    public final SelenideElement acceptbutton = $x("/html/body/div[7]/div[3]/div[2]/form/p/input");
    public final SelenideElement catalogbutton = $x("/html/body/div[1]/div[1]/div/div[9]/p[6]/a");
    public final SelenideElement formanbutton =$x("/html/body/div[1]/div[3]/div[2]/div/div/div/div/div[2]/div/a");
    public final SelenideElement sortelement = $x("/html/body/div[1]/div[3]/div[3]/div[1]/span");
    public final SelenideElement datesort = $x("/html/body/div[1]/div[3]/div[3]/div[1]/div/div[3]");
    public final SelenideElement pricesort1=$x("/html/body/div[1]/div[3]/div[3]/div[1]/div/div[1]");
    public final SelenideElement pricesort2=$x("/html/body/div[1]/div[3]/div[3]/div[1]/div/div[2]");
    public final SelenideElement newselement = $x("/html/body/div[1]/div[1]/div/div[5]/div[2]/div/ul/li[3]/a");
    public final SelenideElement firstnewselem = $x("/html/body/div[1]/div[3]/div[2]/ul/li[1]/div[2]/div[1]/a");
    public final SelenideElement profilebutton = $x("/html/body/div[1]/div[1]/div/div[6]/div[1]/table/tbody/tr/td[3]/a");
    public final SelenideElement emailline = $x("/html/body/div[7]/div[3]/div/form/p[1]/input");
    public final SelenideElement passline = $x("/html/body/div[7]/div[3]/div/form/p[2]/input");
    public final SelenideElement loginbutton = $x("/html/body/div[7]/div[3]/div/form/p[4]/input");
    public final SelenideElement exitprofilebutton = $x("/html/body/div[7]/div[3]/p[4]/a");
    public final SelenideElement shoplist = $x("/html/body/div[1]/div[4]/div[2]/table[1]/tbody/tr/td[1]/a");
    public final SelenideElement brest = $x("/html/body/div[1]/div[3]/div[2]/div/div/div/div[2]/div[3]/div[2]/div[1]");
    public final SelenideElement clothes = $x("/html/body/div[1]/div[3]/div[3]/div[2]/div[6]/div[1]/div/div[1]/table/tbody/tr/td/a/img");
    public final SelenideElement basketbutton = $x("/html/body/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div");
    public void clickOnElement(SelenideElement element){
        element.click();
    }

    public void setValueOnInput(SelenideElement inputElement,String Value){
        inputElement.setValue(Value);
    }

    public void PressTabOnElement(SelenideElement element){
        element.pressTab();
    }

    public void hoverOnElement(SelenideElement element) {
        element.hover();
    }

    public void setSearchLineToValues() throws InterruptedException {
        clickOnElement(searchbutton);
        setValueOnInput(searchline,"Пальто");
        clickOnElement(acceptbutton);
    }
    public void sortBySomething(SelenideElement e){
        clickOnElement(catalogbutton);
        clickOnElement(formanbutton);
        clickOnElement(sortelement);
        clickOnElement(e);
    }
    public void checkLastNews()
    {
        clickOnElement(newselement);
        clickOnElement(firstnewselem);
    }
    public void loginProfile(){
        clickOnElement(profilebutton);
        setValueOnInput(emailline,"rachenok2003@mail.ru");
        setValueOnInput(passline,"1LUwH6qfrm");
        clickOnElement(loginbutton);
    }
    public void checkLocation(){
        hoverOnElement(shoplist);
        clickOnElement(shoplist);
        clickOnElement(brest);
    }
    public void addToBasket(){
        clickOnElement(catalogbutton);
        clickOnElement(formanbutton);
        clickOnElement(clothes);
        clickOnElement(basketbutton);
    }
    public void openPage() {
        open(URL);
    }
}
