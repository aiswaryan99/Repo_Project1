package Pages;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage{

    By classCode = By.xpath("//h3[text()='Class Code']/following-sibling::span");
    By teacherName = By.xpath("//div[@class='text-blk']//following-sibling::span[1]");
    By schoolAddress = By.xpath("//h3[starts-with(text(),'School')]/following-sibling::div");
    By addCard = By.xpath("//div[@class='link link-credit-card']");
    By cardNumField = By.xpath("//input[@class='input-text numericonly positivenumber no-mouseflow required']");
    By monthBox = By.xpath("//div[text()='Month']");
    By monthList = By.xpath("//li[@data-label='month']/following-sibling::li");
    By yearList = By.xpath("//li[@data-label='year']/following-sibling::li");
    By yearBox = By.xpath("//label[@for='dwfrm_paymentinstruments_creditcards_newcreditcard_year']/following-sibling::div[@class='custom-select']");
    By cvvNum = By.xpath("//input[@class='input-text numericonly cvn_input required']");
    By fname = By.id("dwfrm_paymentinstruments_creditcards_address_firstname");
    By lname = By.id("dwfrm_paymentinstruments_creditcards_address_lastname");
    By address = By.id("dwfrm_paymentinstruments_creditcards_address_address1");
    By zip = By.id("dwfrm_paymentinstruments_creditcards_address_postal");
    By phone = By.id("dwfrm_paymentinstruments_creditcards_address_phone");
    By save = By.xpath("//button[@id='applyBtn']");
    By popUpMessage= By.xpath("//div[@class='tooltipster-body']");

    public void teacherNameIsPresent(){
        isElementDisplayed(teacherName);
    }

    public void schoolAddressIsPresent(){
        isElementDisplayed(schoolAddress);
    }

    public String teacherName(){
        return getTextValue(teacherName);
    }

    public String classCodeAccount(){
        return getTextValue(classCode);
    }

    public String schoolAddressText(){
        return getTextValue(schoolAddress);
    }

    public void addCardButton(){
        scrollDown();
        clickThis(addCard);
    }

    public void cardNum(String cnum){
        typeText(cardNumField,cnum);
    }

    public void clickMonth(String month){
        clickThis(monthBox);
        selectFromSuggestions(monthList,month);
    }

    public void clickYear(String year){
        clickThis(yearBox);
        selectFromSuggestions(yearList,year);
    }

    public void securityCode(String cvv){
        typeText(cvvNum,cvv);
    }

    public void firstName(String first){
        typeText(fname,first);
    }

    public void lastName(String last){
        typeText(lname,last);
    }

    public void typeAddress(String add){
        typeText(address,add);
    }

    public void enterZipCode(String zipcode){
        typeText(zip,zipcode);
    }

    public void enterPhone(String phoneNum){
        typeText(phone,phoneNum);
    }

    public void saveButton(){
        waitUntilClickable(save);
    }

    public void addAgain(){
        clickThis(addCard);
    }

    public void cardVerification(){
        isElementDisplayed(popUpMessage);
    }

    public String popMessageText(){
        return getTextValue(popUpMessage);
    }

}
