package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.SignUpPage;
import pageobjects.LoginPage;

public class SignupSteps {
    WebDriver driver;
    SignUpPage signUpPage;
    LoginPage loginPage;
    String email = "qa" + System.currentTimeMillis() + "@test.com";
    String password = "Test@123";

    @Given("User is on Magento home page")
    public void user_is_on_magento_home_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @When("User clicks on Create an Account")
    public void user_clicks_on_create_account() {
        driver.findElement(org.openqa.selenium.By.linkText("Create an Account")).click();
        signUpPage = new SignUpPage(driver);
    }

    @When("User enters valid details and submits")
    public void user_enters_valid_details_and_submits() {
        signUpPage.register("Test", "User", email, password);
    }

    @Then("User should be registered and redirected to My Account")
    public void user_should_be_registered() {
        driver.findElement(org.openqa.selenium.By.linkText("Sign Out")).click();
    }

    @When("User navigates to Sign In page")
    public void user_navigates_to_sign_in_page() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
        loginPage = new LoginPage(driver);
    }

    @When("User logs in with the registered credentials")
    public void user_logs_in_with_registered_credentials() {
        loginPage.login(email, password);
    }

    @Then("User should be logged in and see the My Account page")
    public void user_should_be_logged_in() {
        driver.quit();
    }
}
