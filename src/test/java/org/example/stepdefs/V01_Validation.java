package org.example.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.Bing;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class V01_Validation {
    Bing Bing = new Bing();

    int Number_Of_Searched_Items_In_2nd_Page = 0 ;
    int Number_Of_Searched_Items_In_3rd_Page = 0 ;

    @Given("User Type and search for “Vodafone”")
    public void userTypeAndSearchForVodafone() {
        Bing.Search().sendKeys("Vodafone");

    }

    @And("User click on search")
    public void userClickOnSearch() {
        Bing.SearchButton().click();
    }

    @And("User Scroll Down")
    public void userScrollDown() {
       // JavascriptExecutor jse = (JavascriptExecutor)Hooks.driver;
     //   jse.executeScript("scroll(0, 2550);");
    }

    @And("user go to the second page")
    public void userGoToTheSecondPage() throws InterruptedException {
        Bing.NextPage().click();
    }


    @And("count search items in the second page")
    public void countSearchItemsInTheSecondPage() {
        Number_Of_Searched_Items_In_2nd_Page = Bing.SearchItems().size();
    }

    @And("user go to the third page")
    public void userGoToTheThirdPage() throws InterruptedException {
        Bing.NextPage().click();
    }

    @And("count search items in the third page")
    public void countSearchItemsInTheThirdPage() {
        Number_Of_Searched_Items_In_3rd_Page = Bing.SearchItems().size();
    }

    @Then("Check the number of searched Items in the second page equal to the third page")
    public void checkTheNumberOfSearchedItemsInTheSecondPageEqualToTheThirdPage() {
        Assert.assertEquals(Number_Of_Searched_Items_In_2nd_Page,Number_Of_Searched_Items_In_3rd_Page);
    }
}
