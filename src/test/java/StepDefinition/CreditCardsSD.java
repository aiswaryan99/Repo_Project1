package StepDefinition;

import Pages.AfterLoginPage;
import Pages.BasePage;
import Pages.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class CreditCardsSD extends BasePage {
    AfterLoginPage apage = new AfterLoginPage();
    MyAccountPage mpage = new MyAccountPage();

    @Then("^I click on My Account$")
    public void goToMyAccount() {
        apage.myAccountBox();
    }

    @And("^I click on My Profile$")
    public void goToMyProfile(){
        apage.myProfileBox();
    }

    @Then("^I click on Add a Card$")
    public void addACard(){
        mpage.addCardButton();
    }

    @And("^I enter card number as '(.+)'$")
    public void enterCardNumber(String cNum){
        mpage.cardNum(cNum);
    }

    @And("^I select month as '(.+)'$")
    public void selectMonth(String mon){
        mpage.clickMonth(mon);
    }

    @And("^I select year as '(.+)'$")
    public void selectYear(String year){
        mpage.clickYear(year);
    }

    @And("^I enter security code as '(.+)'$")
    public void enterCvvNumber(String cvvNum){
        mpage.securityCode(cvvNum);
    }

    @And("^I enter first name as '(.+)' in first name field$")
    public void enterFirstName(String firstN) {
        mpage.firstName(firstN);
    }

    @And("^I enter last name as '(.+)' in last name field$")
    public void enterLastName(String lastN) {
        mpage.lastName(lastN);
    }

    @And("^I enter address as '(.+)'$")
    public void enterAddress(String add) {
        mpage.typeAddress(add);
    }

    @And("^I enter zipcode as '(.+)' in zipcode field$")
    public void enterZipCode(String zip) {
        mpage.enterZipCode(zip);
    }

    @And("^I enter phone number as '(.+)'$")
    public void enterPhoneNumber(String num) {
        mpage.enterPhone(num);
    }

    @Then("^I click on save button$")
    public void clickOnSaveButton() {
        mpage.saveButton();
    }

    @Then("^I click on Add a Card again$")
    public void clickAddCardAgain(){
        mpage.addAgain();
    }

    @Then("^I verify that the 'You can only store three credit cards' message appears$")
    public void verifyNoMoreCardsMsg() {
        mpage.cardVerification();
        Assert.assertEquals(mpage.popMessageText(),
                "You can only store three credit cards",
                "Different pop-up message is displayed!");
    }
}
