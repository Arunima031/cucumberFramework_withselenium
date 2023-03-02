package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@title='Search']")
    WebElement SearchTextBox;

    @FindBy(xpath = "//a[text()='Online Courses']")
    WebElement onlineCoursesLink;
    @FindBy(css = "[href*='PLhW3qG5bs-L_s9HdC5zNshE5Ti8jA']")
    WebElement course;

    public void search(String searchItem) {
        SearchTextBox.sendKeys(searchItem);
    }

    public void hit_enter_button() {
        SearchTextBox.sendKeys(Keys.ENTER);
    }

    public void click_online_course_link() {
        onlineCoursesLink.click();
    }
    public void select_course_of_choice(){
        course.click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> itr = windows.iterator();
        String parent_window = itr.next();
        String child_window = itr.next();
        System.out.println(driver.switchTo().window(child_window).getTitle());

    }
    }

