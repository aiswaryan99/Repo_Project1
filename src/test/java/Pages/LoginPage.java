package Pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    By accountEmailField = By.xpath("//input[@placeholder='Scholastic Account Email']");
    By passwordField = By.xpath("//input[@placeholder='Scholastic Account Password']");
    By signIn = By.xpath("//div[@class='signin_icon']");
    By notificationClose = By.xpath("//span[@class='notification-close']");

    public void enterEmail(String email){
        typeText(accountEmailField,email);
    }

    public void enterPassword(String pass){
        typeText(passwordField,pass);
    }

    public void clickSignIn(){
        clickThis(signIn);
        waitUntilClickable(notificationClose);
    }



}
