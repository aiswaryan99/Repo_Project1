package Pages;

import org.openqa.selenium.By;

public class YourTeacherOrder extends BasePage{

    By qtyBox1 = By.xpath("//input[@data-itemid='1S4']");
    By popUpMsg =By.xpath("//div[@class='info-modal-content']");
    By imp = By.xpath("//div[@class='info-modal-hd']");
    By xBox = By.xpath("//i[@class='fa fa-times info-modal-close']");
    By qtyBox2 = By.xpath("//input[@data-itemid='3S4']");

    public void clickQtyBox(){
        scrollMiddle();
        clickThis(qtyBox1);
    }

    public void headingPresent(){
        isElementDisplayed(imp);
    }

    public String headingText(){
        return getTextValue(imp);
    }

    public void popUpMsgIsPresent(){
        isElementDisplayed(popUpMsg);
    }

    public String popUpText(){
        return getTextValue(popUpMsg);
    }

    public void enterQtyNum(String num){
        typeText(qtyBox1,num);
    }
    public void enterQtyNum2(String num){
        typeText(qtyBox2,num);
    }

    public void close(){
        clickThis(xBox);
    }

    public void otherQtyBox(){
        clickThis(qtyBox2);
        isElementDisplayed(imp);
        isElementDisplayed(popUpMsg);
    }

}
