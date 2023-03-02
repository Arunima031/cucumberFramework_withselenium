package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
WebDriver driver;
    public loginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="name")
    WebElement usernameTextBox;

    @FindBy(id="password")
    WebElement passwordTextBox;

    @FindBy(id="login")
    WebElement loginBtn;

    public void getUserNameTextBox(String username){
       usernameTextBox.sendKeys(username);
    }
    public void getPasswordTextBox(String password){
        passwordTextBox.sendKeys(password);
    }
    public void getLoginBtn(){
        loginBtn.click();
    }
}
