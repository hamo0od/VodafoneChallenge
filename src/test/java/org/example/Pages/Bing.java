package org.example.Pages;

import org.example.stepdefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Bing {
    public WebElement Search (){
        WebElement search = Hooks.driver.findElement(By.cssSelector("input[id=sb_form_q]")) ;
        return search;
    }
    public WebElement SearchButton (){
        WebElement searchButton = Hooks.driver.findElement(By.cssSelector("svg[viewBox=\"0 0 25 25\"]")) ;
        return searchButton;
    }

    public WebElement NextPage () throws InterruptedException {

        Thread.sleep(4000);
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(30));
        WebElement nextpage = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class=\"sb_pagN sb_pagN_bp b_widePag sb_bp \"]")));
        return nextpage;
    }
    public List<WebElement>  SearchItems (){
        List<WebElement> SearchItems = Hooks.driver.findElement(By.cssSelector("ol[id =\"b_results\"]")).findElements(By.cssSelector("li[class=\"b_algo\"]")) ;
        return SearchItems;
    }


}
