package CnnCommon;

import base.Base;

import java.util.List;

public class Page extends Base {
    public final static String us = "#nav-us";
    public final static String world = "#nav-world";
    public final static String politics = "#nav-politics";
    public final static String justice = "#nav-justice";
    public final static String entertainment = "#nav-entertainment";
    public final static String tech = "#nav-tech";
    public final static String health= "#nav-health";
    public final static String living = "#nav-living";
    public final static String travel = "#nav-travel";
    public final static String opinion = "#nav-opinion";
    public final static String money = "#nav-money";

    public  void goToWorld(){
        clickByCss(world);
    }
    public void goToPolitics(){
        clickByCss(politics);
    }
    public void goToJustice(){
        clickByCss(justice);
    }
    public void goToTech(){
        clickByCss(tech);
    }
    public void goToHealth(){
        clickByCss(health);
    }
    public void goToLiving(){
        clickByCss(living);
    }
    public void goToTravel(){
        clickByCss(travel);
    }
    public void goToMoney(){
        clickByCss(money);
    }
    public void clickOnNews(String locator){
        List<String> news = getListOfString(locator);
        for(String st:news){
            System.out.println(st);
        }
    }
}
