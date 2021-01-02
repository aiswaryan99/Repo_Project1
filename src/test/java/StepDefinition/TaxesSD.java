package StepDefinition;

import Pages.BasePage;
import Pages.Checkout;
import Pages.StudentFlyerOrder;
import Pages.YourTeacherOrder;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class TaxesSD {

    StudentFlyerOrder spage = new StudentFlyerOrder();
    Checkout cpage = new Checkout();
    YourTeacherOrder ypage = new YourTeacherOrder();

    @Then("^I enter '(.+)' in qty box for box 1$")
    public void enterQTY1(String qty){
        spage.enterJBox1(qty);
    }

    @Then("^I enter '(.+)' in qty box for box 2$")
    public void enterQTY2(String qty){
        spage.enterHBox1(qty);
    }

    @Then("^I enter '(.+)' in qty box for box 3$")
    public void enterQTY3(String qty){
        spage.enterMBox1(qty);
    }

    @Then("^I enter '(.+)' in qty box for box 4$")
    public void enterQTY4(String qty){
        spage.enterHBox2(qty);
    }

    @Then("^I enter '(.+)' in qty box for box 5$")
    public void enterQTY5(String qty){
        spage.enterMBox2(qty);
    }

    @Then("^I click on 'Review Cart' Button$")
    public void clickOnReviewCartButton() {
        spage.reviewCart();
    }

    @Then("^I click on 'Proceed to Checkout' button$")
    public void clickOnProceedToCheckoutButton() {
        spage.proceedCheckOut();
    }


    @Then("^I click on 'Proceed to Checkout' button again$")
    public void clickOnProceedToCheckoutButtonAgain() {
        spage.proceedCheckOutAgain();
    }

    @Then("^I verify if the tax amount is equal to zero$")
    public void verifyTaxIsZero() {
        Assert.assertEquals(cpage.verifyNoTax(),"0.00",
                "The tax is greater that zero!");
    }

    @Then("^I click on one box to change the quantity of book one to '(.+)'$")
    public void changeQuantityOfFirstBook(String num) {
        ypage.enterQtyNum(num);
    }

    @Then("^I click on one box to change the quantity of book two to '(.+)'$")
    public void changeQuantityOfSecondBook(String num) {
        ypage.enterQtyNum2(num);
    }

    @Then("^I verify the tax amount is greater than zero$")
    public void verifyTheTaxAmountIsGreaterThanZero() {
        Assert.assertTrue(cpage.verifyTax(),"Tax is not greater than zero!");
    }
}
