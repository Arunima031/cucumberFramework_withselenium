package StepDefinitions;

import PageObjects.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SearchSteps {
    public WebDriver driver=null;
    Hooks hooks;
    SearchPage searchPageObj;
    public SearchSteps() {
        this.driver = hooks .driver;
    }
    @When("User opens google")
    public void open_google() {
        driver.get("https://www.google.com/");

    }

    @When("User enters the search item")
    public void user_enters_the_search_item() {
        searchPageObj=new SearchPage(driver);
        searchPageObj.search("Automation Step by step");
    }

    @And("User hits enter")
    public void hit_enter() {
        searchPageObj.hit_enter_button();
    }

    @Then("Search results open")
    public void search_results_open() {
        driver.getPageSource().contains("Online Courses");
    }

    @And("user clicks on online courses")
    public void click_online_courses() {
       searchPageObj.click_online_course_link();
    }

    @And("User chooses course of interest")
    public void course_select() {
        searchPageObj.select_course_of_choice();
    }
       }


