package StepDefinition;

import Pages.AfterLoginPage;
import Pages.StudentFlyerOrder;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class StudentFlyerSD {

AfterLoginPage apage = new AfterLoginPage();
StudentFlyerOrder spage = new StudentFlyerOrder();

    @Then("^I hover over the 'Enter Orders' tab under Scholastic Book Clubs$")
    public void hoverOverMyOrders() {
        apage.hoverEnterOrders();
    }

    @Then("^I click on 'Student Flyer Orders' under 'Enter Orders' tab$")
    public void clickOnSFO(){
        apage.clickOnStudentFlyerOrders();
    }

    @Then("^I enter student's name as '(.+)'$")
    public void enterStudentName(String stName){
        spage.studentName(stName);
    }

    @Then("^I enter '(.+)' as the item number$")
    public void enterItemNumber(String num) {
        spage.itemNumber(num);
    }

    @Then("^I click on add button$")
    public void clickOnAddButton() throws InterruptedException {
        spage.addButton();
    }

    @Then("^I verify the pop-up message 'Please enter a valid item number.'$")
    public void verifyPopUpMsg() {
        spage.popUpMessageIsPresent();
        Assert.assertEquals(spage.popUpText(),"Please enter a valid item number.",
                "Different message is displayed in pop-up message!");
    }

    @Then("^I click on 'x' button$")
    public void clickOnXButton() {
        spage.clickX();
    }

    @Then("^I verify total quantity before clicking x button$")
    public void verifyTotalQuantityBeforeClickingXButton() {
        Assert.assertEquals(spage.actualQuantityBefore(),spage.getPreviousQuantity(),
                "Total quantity number displayed is incorrect!");
    }

    @And("^I verify the total quantity has lowered after clicking x$")
    public void verifyTheTotalQuantityHasLoweredAfterClickingX() {
        Assert.assertEquals(spage.actualQuantityAfter(),spage.getAfterQuantity(),
                "Total quantity displayed is incorrect!");
    }
}
