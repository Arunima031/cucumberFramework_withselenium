package StepDefinitions;


import PageObjects.HomePage;
import PageObjects.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class LoginSteps  {

    public WebDriver driver = null;
    loginPage loginPageObj;
    HomePage homePageObj;
    Hooks hooks;
    public LoginSteps() {
        this.driver = hooks .driver;
    }

    @Given("User is on login page")
    public void open_website() {
      driver.get("https://example.testproject.io/");
    }

    @When("User enters credentials")
    public void user_enters_username_and_password() {
        loginPageObj =new loginPage(driver);
        loginPageObj.getUserNameTextBox("testing");
        loginPageObj.getPasswordTextBox("12345");
    }

    @And("User clicks on login button")
    public void user_clicks_on_login_button() {
        loginPageObj.getLoginBtn();
    }

    @Then("User lands to homepage")
    public void user_lands_to_homepage() {
        System.out.println(driver.getTitle());
        homePageObj= new HomePage(driver);
        System.out.println(homePageObj.getLogoutBtn().isDisplayed());
        homePageObj.clickLogoutBtn();
    }

    @When("^User enters (.*) and (.*)$")
    public void enter_creds(String username,String password){
        loginPageObj =new loginPage(driver);
        loginPageObj.getUserNameTextBox(username);
        loginPageObj.getPasswordTextBox(password);
    }


}
