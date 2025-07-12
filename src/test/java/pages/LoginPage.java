package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    private By usernameField = By.xpath("//input[@placeholder='Enter User Name']");
    private By passwordField = By.xpath("//input[@placeholder='Enter Password']");
    private By loginButton = By.xpath("//button[contains(.,'Log In')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
