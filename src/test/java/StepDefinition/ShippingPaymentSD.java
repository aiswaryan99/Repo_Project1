package StepDefinition;

import Pages.MyAccountPage;
import Pages.ShippingPayment;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class ShippingPaymentSD {

    ShippingPayment spage = new ShippingPayment();
    MyAccountPage mpage = new MyAccountPage();

    @Then("^I click on 'Continue Checkout' Button$")
    public void continueCheckout(){
            spage.clickCheckoutCont();
    }

    @Then("^I click on 'Select Payment Method' box$")
    public void iClickOnSelectPaymentMethodBox() {
        spage.clickSelectPayment();
    }

    @And("^I click on 'Credit Card' on dropdown$")
    public void clickOnCreditCard() {
        spage.clickCreditCard();
    }

    @Then("^I click on 'Select a Card' box$")
    public void clickOnSelectACard() {
        spage.clickSelectCard();
    }

    @And("^I click on 'Add a New Card' from dropdown$")
    public void clickOnAddANewCard() {
        spage.clickAddNew();
    }

    @Then("^I click on 'Continue Checkout' Button again$")
    public void clickOnContinueCheckoutAgain() {
        spage.clickOnCheckoutAgain();
    }

    @Then("^I click on 'Submit Order' Button$")
    public void clickOnSubmitOrderButton() {
        spage.submitOrder();
    }

    @Then("^I verify Thank You message is displayed$")
    public void verifyThankYouMessageIsDisplayed() {
        Assert.assertTrue(spage.thankYouMsgIsPresent(),"Thank You message is not displayed!");
        Assert.assertEquals(spage.thankYouMessage(),"Thank You for Your Order!",
                "The incorrect message is displayed!");
    }

    @And("^I verify the order receipt reference number is displayed$")
    public void verifyTheOrderReceiptReferenceNumberIsPresent() {
        Assert.assertTrue(spage.orderReceiptNumIsDisplayed(),
                "The order receipt reference number is not displayed!");
    }
}
