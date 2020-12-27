package Pages;

import org.openqa.selenium.By;

public class StudentFlyerOrder extends BasePage{

    By Sname = By.id("student-name");
    By item = By.id("item-number");
    By add = By.xpath("//button[@class='btn-add']");
    By popUp = By.xpath("//span[@id='error-message-tooltip']");

    public void studentName(String name){
        typeText(Sname,name);
    }

    public void itemNumber(String num){
        typeText(item,num);
    }

    public void addButton(){
        clickThis(add);
    }

    public void popUpMessageIsPresent(){
        isElementDisplayed(popUp);
    }

    public String popUpText(){
        return getTextValue(popUp);
    }


}
