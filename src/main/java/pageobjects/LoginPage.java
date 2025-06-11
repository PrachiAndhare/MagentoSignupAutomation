package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By email = By.id("email");
    By password = By.id("pass");
    By loginButton = By.id("send2");

    public void login(String emailId, String pwd) {
        driver.findElement(email).sendKeys(emailId);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginButton).click();
    }
}
