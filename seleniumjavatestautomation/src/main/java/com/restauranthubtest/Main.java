package com.restauranthubtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\vscode-projects\\restaurant-hub-ms1\\seleniumjavatestautomation\\drivers\\chromedriver.exe");
        webDriber driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        

        System.out.println("my first selenium java project");
    }
}
 