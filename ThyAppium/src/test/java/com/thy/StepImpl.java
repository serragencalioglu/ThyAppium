package com.thy;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.Assert;

import java.util.Random;

import static element.BookAFlightPageElements.*;
import static element.FlightResultsPage.*;
import static element.HomePageElements.*;


public class StepImpl extends HookImpl{

    @Step({"<seconds> saniye bekle"})
    public void waitBySecond(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step({"Al butonuna varsa tikla"})
    public void existClickByKey() {
        Assert.assertTrue(BookAFlightBy.isDisplayed());
        BookAFlightBy.click();
    }

    @Step({"Tek Yön Uçuş seç"})
    public void oneWay(){
        oneWayButtonBy.click();
    }

    @Step({"kalkış yeri seç"})
    public void selectDeparture(){
        //Assert.assertTrue(fromToButtonBy.isDisplayed());
        fromToButtonBy.click();
    }

    @Step({"Kalkış yerini <key> olarak seç"})
    public void sendKey(String key){
        //Assert.assertTrue(fromToSearchBoxButtonBy.isDisplayed());
        fromToSearchBoxButtonBy.sendKeys(key);
        //Assert.assertTrue(fromToSelectResultBy.isDisplayed());
        fromToSelectResultBy.click();
    }

    @Step({"Varış yerini <key> olarak seç"})
    public void sendArrival(String key){
        goToButtonBy.click();
        goToSearchBoxButtonBy.sendKeys("ESB");
        goToSelectResultBy.click();
    }

    @Step({"Tarih seç"})
    public void selectDate(){
        dateButtonBy.click();
        dateListBy.get(0).isSelected();
        dateListBy.get(getDate()).click();

    }

    public static int getDate(){
        int index = 0;
        for (MobileElement element: dateListBy) {
            if (element.isSelected()){
                index = dateListBy.indexOf(element) + 2;
            }
        }
        return index;
    }

    @Step("Tamam butonuna tıkla")
    public void clickOK(){
        doneButtonBy.click();
    }

    @Step({"Kişi sayısını <key> artır"})
    public void numberOfPassengers(int key){
        for (int i = 0; i < key; i++){
            addingPersonButtonBy.click();
        }
    }

    @Step({"Uçuş ara"})
    public void searchFlight(){
        searchFlightBy.click();
    }

    @Step({"Uçuş liste kontrol"})
    public void listControl(){
        Assert.assertTrue(flightAreaBy.isDisplayed());
    }

    @Step({"Ekonomik Uçuş seç"})
    public void selectEcoFly(){

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(flightListBy.size());
        flightListBy.get(randomNumber).click();
        selectEcoFlightBy.get(0).click();
    }

    @Step({"Devam Butonuna tıklanır"})
    public void clickContinue(){
        continueButtonBy.click();
    }

}
