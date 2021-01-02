package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class LandingPage extends BasePage {

    By frame = By.xpath("//iframe[@class='aamIframeLoaded']");
    By createAccountLink = By.linkText("Create an Account");
    By clickOnTeacherAdmin= By.xpath("//label[@for='acccountTeacther']");
    By clickOnNext = By.id("linkChooseAcount");
    By title = By.xpath("//div[@class='selected-option input-select profile-title required' or contains(text(),'Select Title')]");
    By titleListLoc = By.xpath("//li[@class='custom-option select-option']");
    By fname = By.id("dwfrm_profile_customer_firstname");
    By lname = By.id("dwfrm_profile_customer_lastname");
    By email = By.id("dwfrm_profile_customer_email");
    By pass = By.id("dwfrm_profile_login_password");
    By checkBox = By.id("dwfrm_registration_termsofuseteacher");
    By nextButton = By.xpath("//button[@class='button-continue']");
    By zip = By.id("dwfrm_myschool_schoolzip");
    By searchButton = By.id("button-search");
    By school = By.id("dwfrm_searchschool_schoolvalue");
    By schoolDropdown = By.xpath("//li[@class='ui-menu-item']");
    By nextAgain= By.xpath("//button[@name='dwfrm_searchschool_findnext']");
    By role = By.xpath("//div[@class='selected-option input-select primaryrole required']");
    By grade = By.xpath("//li[@class='custom-option select-option' and @data-label='teacher (by grade)']");
    By gradeDropdown = By.xpath("//div[@class='selected-option input-select noscroll']");
    By firstGradeLoc = By.xpath("//li[@data-label='1st grade']");
    By numStudents = By.xpath("//input[@id='dwfrm_myrole_students']");
    By nextRole= By.xpath("//button[@class='next-button button-continue']");
    By readLevelBox = By.xpath("//div[@class='selected-option input-select required']");
    By grloption = By.xpath("//li[@class='custom-option select-option']//span[1]");
    By continueButton = By.xpath("//button[@class='button-continue']");
    By stateField= By.xpath("//div[@class='selected-option input-select selected-active']");
    By selectStateDrpDwn = By.xpath("//li[@class='custom-option select-option']/span");
    By cityElem = By.xpath("//li[@class='custom-option select-option']/*[contains(text(), ' New York')]");
    By cityField = By.name("dwfrm_myschool_schoolcity");
    By selectCity = By.xpath("//li[@class='ui-menu-item']");
    By search = By.xpath("//button[@class='button-continue']");
    By schoolAddress = By.xpath("//div[@class='school-selection']");

    public void switchToFrame(){
        WebElement myFrame = Web.getDriver().findElement(frame);
        Web.getDriver().switchTo().frame(myFrame);
        Web.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clickCreateAccount(){
        clickThis(createAccountLink);
    }

    public void clickOnTeacherAdmin(){
        clickThis(clickOnTeacherAdmin);
    }

    public void setClickOnNextButton(){
        clickThis(clickOnNext);
    }

    public void selectTitleDropdown(String data){
        clickThis(title);
        selectFromSuggestions(titleListLoc,data);
    }

    public void firstName(String name){
        typeText(fname,name);
    }

    public void lastName(String name){
        typeText(lname,name);
    }

    public void enterEmail(String emailData){
        typeText(email,emailData);
    }

    public void enterPass(String password){
        typeText(pass,password);
    }

    public void clickBox(){
        clickThis(checkBox);
    }

    public void clickOnNextButton(){
        clickThis(nextButton);
    }

    public void enterZip(String zipcode){
        typeText(zip,zipcode);
    }

    public void clickSearchButton(){
        clickThis(searchButton);
        implicitWait(5);
    }

    public void typeSchoolName(String schoolName){
        typeText(school,schoolName);
        implicitWait(70);
        clickThis(school);
    }

    public void selectSchoolName(String schoolName){
        selectFromSuggestions(schoolDropdown,schoolName);
    }


    public void clickOnNextAgain(){
        clickThis(nextAgain);
    }

    public void pickRole(){
        clickThis(role);
        clickThis(grade);
    }

    public void pickGrade(String grade){
        implicitWait(10);
        clickThis(gradeDropdown);
        clickThis(firstGradeLoc);
    }

    public void numS(String num){
        clickThis(numStudents);
        typeText(numStudents,num);
    }

    public void nextAgainRole(){
        clickThis(nextRole);
    }

    public void selectRead(String level){
        implicitWait(10);
        clickThis(readLevelBox);
        clickThis(grloption);
    }

    public void continueToSiteButton(){
        clickThis(continueButton);
    }

    public void searchByState(String state){
        clickThis(stateField);
        selectFromSuggestions(selectStateDrpDwn,state);
    }

    public void searchCity(String city){
        typeText(cityField,city);
        selectFromSuggestions(cityElem,city);
    }

    public void clickS(){
        clickThis(search);
    }

    public void closePage() {
        Web.getDriver().close();
    }
}
