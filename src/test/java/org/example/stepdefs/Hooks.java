package org.example.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {
    // Declare a static WebDriver object to be used across test scenarios
    public static WebDriver driver;

    // This method runs before each scenario and sets up the WebDriver instance
    @Before
    public void openBrowser() {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize ChromeDriver
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Set implicit wait timeout to 7 seconds to handle page loading and element location
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        // Navigate to the Bing website
        driver.navigate().to("https://www.bing.com");
    }

    // This method runs after each scenario and closes the WebDriver instance
    @After
    public void quitDriver() throws InterruptedException {
        // Add a delay of 5 seconds to ensure all actions are completed before quitting the browser
        Thread.sleep(5000);

        // Quit the WebDriver instance
        driver.quit();
    }
}
