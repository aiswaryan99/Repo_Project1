package Pages;

import org.openqa.selenium.By;

public class AfterLoginPage extends BasePage{

    By notificationClose = By.xpath("//span[@class='notification-close']");
    By classCode = By.xpath("//div[@class='label'and contains(text(),'Class Code')]/following-sibling::div[@class='details']");
    By myAccount = By.xpath("//span[@class='hide-mobile user-account-name']/parent::a");
    By myProfile = By.xpath("//a[@title='Profile']");
    By enterOrders= By.xpath("(//div[@class='subheader-menu']//li//a[@id='enter-orders'])[2]");
    By SFO = By.linkText("Student Flyer Orders");
    By YTO = By.linkText("Your Teacher Order");

    public void verifyClassCodePresentOnLoginPage(){
        waitUntilClickable(notificationClose);
        isElementDisplayed(classCode);
    }

    public void myAccountBox() {
        waitUntilClickable(myAccount);
    }

    public void myProfileBox(){
        waitUntilClickable(myProfile);
        scrollMiddle();
    }

    public String getClassCode(){
        isElementDisplayed(classCode);
        return getTextValue(classCode);
    }

    public void hoverEnterOrders(){
        waitUntilClickable(notificationClose);
        hoverOver(enterOrders);
    }

    public void clickOnStudentFlyerOrders(){
        clickThis(SFO);
    }

    public void clickOnYTO(){
        clickThis(YTO);
    }




}
